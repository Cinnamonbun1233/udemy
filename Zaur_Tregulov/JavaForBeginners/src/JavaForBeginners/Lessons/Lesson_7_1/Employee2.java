package JavaForBeginners.Lessons.Lesson_7_1;

public class Employee2 {

    public static void main(String[] args) {

        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}