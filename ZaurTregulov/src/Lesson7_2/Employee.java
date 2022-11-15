package Lesson7_2;

public class Employee {

    public static void main(String[] args) {
        Lesson7_1.Employee employee = new Lesson7_1.Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}