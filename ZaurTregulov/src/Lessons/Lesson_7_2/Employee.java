package Lessons.Lesson_7_2;

public class Employee {

    public static void main(String[] args) {
        Lessons.Lesson_7_1.Employee employee = new Lessons.Lesson_7_1.Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}