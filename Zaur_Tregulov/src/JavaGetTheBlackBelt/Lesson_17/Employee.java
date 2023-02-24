package JavaGetTheBlackBelt.Lesson_17;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        if (result == 0) {
            result = this.name.compareTo(employee.name);
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
//        Employee emp1 = new Employee(100, "Заур", 12345);
//        Employee emp2 = new Employee(15, "Иван", 6542);
//        Employee emp3 = new Employee(123, "Пётр", 8542);
//        Employee emp4 = new Employee(15, "Мария", 5678);
//        Employee emp5 = new Employee(182, "Коля", 125);
//        Employee emp6 = new Employee(15, "Саша", 9874);
//        Employee emp7 = new Employee(250, "Елена", 1579);
//        List<Employee> list = new ArrayList<>();
//        list.add(emp1);
//        list.add(emp2);
//        list.add(emp3);
//        list.add(emp4);
//        list.add(emp5);
//        list.add(emp6);
//        list.add(emp7);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        int index = Collections.binarySearch(list, new Employee(182, "Коля", 125));
//        System.out.println(index);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 150);
        System.out.println(index);
    }
}