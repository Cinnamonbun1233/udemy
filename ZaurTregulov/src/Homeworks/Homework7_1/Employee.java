package Homeworks.Homework7_1;

public class Employee {

    public String surname;
    int id;
    private double salary;

    private Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id) {
        this.id = id;
    }

    public static void main(String[] args) {

        Employee employee = new Employee(100.00);
        employee.showInfo(employee.salary);
    }

    public void showInfo(double salary) {
        System.out.println(salary);
    }

    public void showInfo(String surname) {
        System.out.println(surname);
    }

    public void showInfo(int id) {
        System.out.println(id);
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(10);
        employee.showInfo(employee.id);
    }
}
