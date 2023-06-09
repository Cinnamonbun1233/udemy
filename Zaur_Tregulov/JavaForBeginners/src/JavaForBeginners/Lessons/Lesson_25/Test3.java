package JavaForBeginners.Lessons.Lesson_25;

public class Test3 {
    public static void main(String[] args) {
//        Employee1 emp1 = new Doctor1();
//        Employee1 emp2 = new Teacher1();
//        Employee1 emp3 = new Driver1();
//        HelpAble1 helpAble1 = new Doctor1();
//        Employee1 employee1 = new Doctor1();
//        Employee1 employee11 = new Employee1();
//
//        Doctor1 d1 = (Doctor1) emp1;
//        d1.name = "Хирург";
//        System.out.println(d1.name);
//        d1.heal();
//
//        helpAble1.help();
//        ((Doctor1) helpAble1).heal();
//
//        Driver1 driver1 = (Driver1) emp2;
//
//        ((Doctor1) employee1).help();
//
//        System.out.println(emp1==employee11);
//        System.out.println(emp1.equals(employee11));

        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Employee1 emp4 = new Employee1();

        Employee1[] array = {emp1, emp2, emp3, emp4};

        for (Employee1 e : array) {
            if (e instanceof Driver1) {
                System.out.println(((Driver1) e).carBrand);
                ((Driver1)e).drive();
            }
        }
    }
}

interface HelpAble1 {
    void help();
}

class Employee1 extends java.lang.Object {
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

class Doctor1 extends Employee1 implements HelpAble1 {
    String specialization;

    public void help() {
        System.out.println("Доктор оказывает помощь");
    }

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher1 extends Employee1 {
    int studentCount;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver1 extends Employee1 {
    String carBrand = "Mercedes";

    void drive() {
        System.out.println("Водить");
    }
}