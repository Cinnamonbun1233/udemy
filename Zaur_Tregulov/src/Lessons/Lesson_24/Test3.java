package Lessons.Lesson_24;

public class Test3 {
    public static void main(String[] args) {
        HelpAble helpAble = new Driver();
        SwimAble swimAble = new Driver();
        Employee employee = new Driver();
        System.out.println(helpAble.A);
//        System.out.println(helpAble.salary); не могу вызвать
        helpAble.firstAid();
        helpAble.extinguishTheFire("вода");
        swimAble.swim();
    }
}

class Employee {
    String name = "Kolya";
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

class Driver extends Employee implements HelpAble, SwimAble {
    String carBrand;

    void drive() {
        System.out.println("Водить");
    }

    @Override
    public void firstAid() {
        System.out.println("Водитель оказывает помощь");
    }

    @Override
    public void extinguishTheFire(String s) {
        System.out.println("Водитель тушит пожар");
    }

    @Override
    public void swim() {
        System.out.println("Водитель может плавать");
    }
}

class Teacher extends Employee implements HelpAble {
    int studentCount;

    void teach() {
        System.out.println("Учить");
    }

    @Override
    public void firstAid() {
        System.out.println("Учитель оказывает помощь");
    }

    @Override
    public void extinguishTheFire(String s) {
        System.out.println("Учитель тушит пожар");
    }
}

interface HelpAble {
    final static int A = 100500;

    void firstAid();

    void extinguishTheFire(String thing);
}

interface SwimAble {
    void swim();
}

abstract class Y implements SwimAble {

}

abstract class X extends Y {

}

class Z extends Y {
    public void swim() {
    }
}