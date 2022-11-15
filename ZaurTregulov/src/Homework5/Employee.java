package Homework5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(7243, "Иванов", 27, 100000, "ИТ");
        Employee employee2 = new Employee(7821, "Петров", 32, 150000, "ИТ");

        employee1.doubleSalary();
        employee2.doubleSalary();
        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
    }
}
