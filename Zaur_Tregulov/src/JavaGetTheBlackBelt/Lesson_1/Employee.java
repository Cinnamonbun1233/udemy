package JavaGetTheBlackBelt.Lesson_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Заур", "Трегулов", 100_000);
        Employee emp2 = new Employee(15, "Иван", "Петров", 150_000);
        Employee emp3 = new Employee(120, "Александр", "Сидоров", 75_000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Перел сортировкой \n" + list);
        Collections.sort(list);
        System.out.println("После сортировки \n" + list);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" +
                salary + '}';
    }

    @Override
    public int compareTo(Employee employee) {
//        return Integer.compare(this.id, employee.id);
//        return this.name.compareTo(employee.name);
        int result = this.name.compareTo(employee.name);
        if (result == 0) {
            result = this.surname.compareTo(employee.surname);
        }
        return result;
    }
}