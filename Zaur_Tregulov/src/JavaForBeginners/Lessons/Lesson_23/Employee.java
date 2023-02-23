package JavaForBeginners.Lessons.Lesson_23;

public class Employee {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee {
    String specialization;

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher extends Employee {
    int studentCount;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    String carBrand;

    void drive() {
        System.out.println("Водить");
    }
}

class Surgeon extends Doctor {
    String scalpel;

    public void operation() {
        System.out.println("Делаю операцию");
    }
}

class Test {

    public Object abc() {
        return new String("Doctor");
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Driver driver = new Driver();
        Employee employee = new Employee();

        Employee employee1 = new Doctor();
        System.out.println(employee1.salary);
        System.out.println(employee1.name);
        System.out.println(employee1.age);
        System.out.println(employee1.experience);
        employee1.eat();
        employee1.sleep();

        Employee employee2 = new Teacher();
        Employee employee3 = new Driver();
        Surgeon surgeon = new Surgeon();

        Doctor doctor1 = new Surgeon();
        doctor1.heal();
        System.out.println(doctor1.age);
        System.out.println(doctor1.salary);
        System.out.println(doctor1.name);
        System.out.println(doctor1.specialization);
        System.out.println(doctor1.experience);

        Employee employee4 = new Surgeon();
        employee4.eat();
        employee4.sleep();
        System.out.println(employee4.experience);
        System.out.println(employee4.age);
        System.out.println(employee4.salary);
        System.out.println(employee4.experience);

    }
}