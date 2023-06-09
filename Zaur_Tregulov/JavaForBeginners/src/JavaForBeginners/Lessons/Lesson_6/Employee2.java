package JavaForBeginners.Lessons.Lesson_6;

public class Employee2 {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee2(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

    Employee2(String surname, int age) {
        this(0, surname, age, 0.0, null);
    }

    Employee2(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeTest2 {
    public static void main(String[] args) {

        Employee2 employee1 = new Employee2(1, "Иванов", 25);
        System.out.println(employee1.id);
        Employee2 employee2 = new Employee2("Петров", 30);
        System.out.println(employee2.age);
        Employee2 employee3 = new Employee2(2, "Сидоров", 45, 100000, "Инженер");
        System.out.println(employee3.department);
    }
}