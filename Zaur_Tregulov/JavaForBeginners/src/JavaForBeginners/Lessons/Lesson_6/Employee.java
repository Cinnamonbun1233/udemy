package JavaForBeginners.Lessons.Lesson_6;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age) {
        this(surname, age);
        this.id = id;
    }

    Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Иванов", 25);
        System.out.println(employee1.id);
        Employee employee2 = new Employee("Петров", 30);
        System.out.println(employee2.age);
        Employee employee3 = new Employee(2, "Сидоров", 45, 100000, "Инженер");
        System.out.println(employee3.department);
    }
}