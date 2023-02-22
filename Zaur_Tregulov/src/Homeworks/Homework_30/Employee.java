package Homeworks.Homework_30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public void printEmployee(Employee employee) {
        System.out.println("Имя работника: " + employee.name + ", департамент: " + employee.department + ", зарплата: " + employee.salary);
    }

    public void employeeFilter(ArrayList<Employee> arrayList, Predicate<Employee> employeePredicate) {
        for (Employee employee : arrayList){
            if (employeePredicate.test(employee)){
                printEmployee(employee);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee employee1 = new Employee("Иван", "ИТ", 100_000);
        Employee employee2 = new Employee("Мария", "Мария", 75_000);
        Employee employee3 = new Employee("Александр", "Продажи", 125_000);
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        TestEmployee te = new TestEmployee();

        te.employeeFilter(arrayList, x -> x.department.equals("ИТ") && x.salary > 75_000);
        System.out.println("----------");
        te.employeeFilter(arrayList, x -> x.name.startsWith("А") && x.salary < 150_000);
        System.out.println("----------");
        te.employeeFilter(arrayList, x -> x.name.equals(x.department));

    }
}
