package JavaForBeginners.Lessons.Lesson_22;

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

class Surgeon extends Doctor {
    String scalpel;

    void operation() {
    }
}

class Dentist extends Doctor {
    int teeth;
}

class Teacher extends Employee {
    int studentCount;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver {
    String carBrand;

    void drive() {
        System.out.println("Водить");
    }
}

class TestEmp {
    public static void main(String[] args) {
        TestEmp testEmp = new TestEmp();
        Doctor d = new Doctor();
        d.name = "Ivan";
        d.age = 50;
        d.experience = 25;
        d.eat();
        d.specialization = "surgeon";
        System.out.println(d.salary);
        testEmp.salaryIncrease(d);
        System.out.println(d.salary);
    }

    void salaryIncrease(Employee e) {
        e.salary += 100;
    }
}