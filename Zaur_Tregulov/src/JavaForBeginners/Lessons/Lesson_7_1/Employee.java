package JavaForBeginners.Lessons.Lesson_7_1;

public class Employee {

    public double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }

    public void doubleSalary() {
        System.out.println("Новая ЗП: " + (salary * 2));
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}