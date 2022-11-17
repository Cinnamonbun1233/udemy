package Lessons.Lesson7_2;

public class Employee {

    public static void main(String[] args) {
        Lessons.Lesson7_1.Employee employee = new Lessons.Lesson7_1.Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}