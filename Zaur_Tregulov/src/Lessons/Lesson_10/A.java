package Lessons.Lesson_10;

import Lessons.Lesson_8.Student;
import Lessons.Lesson_9.Car;

public class A {

    public static void main(String[] args) {

        Car c2 = new Car("red", "V6");
        Student st1 = new Student("Ivan", 2);
        System.out.println(c2.a);
        System.out.println(Student.count);
    }
}

class B {

    Student st2 = new Student("Petr", 3);
}