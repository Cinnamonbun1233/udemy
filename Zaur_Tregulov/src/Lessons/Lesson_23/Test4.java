package Lessons.Lesson_23;

public class Test4 {
    public static void main(String[] args) {
        Employee1 employee1 = new Teacher1();
        Teacher1 teacher1 = new Teacher1();
        //employee1.sleep();
        teacher1.sleep();
        System.out.println(teacher1.salary);

        Employee1 employee2 = new Teacher1();
        employee2.sleep();
    }
}

class Employee1 {
    String name;
    int age;
    int experience;
    double salary = 100;

    public Eat eat() {
        System.out.println("Кушает работник");
        return new Eat();
    }

    void sleep() {
        System.out.println("Спит работник");
    }
}

class Teacher1 extends Employee1 {

    double salary = 200;
    int studentCount;

    @Override
    public Fruit eat() {
        System.out.println("Кушает учитель");
        return new Fruit();
    }

    void teach() {
        System.out.println("Учить");
    }

    @Override
    void sleep() {
        System.out.println("Спит учитель");
    }
}

class Eat {
}

class Fruit extends Eat {
}

class A {
    Employee1 objectCreation() {
        return new Employee1();
    }
}

class B {
    Teacher1 objectCreation() {
        System.out.println("Ok");
        return new H();
    }
}

class H extends Teacher1 {
}

final class T {
}

//class P extends T {
//}