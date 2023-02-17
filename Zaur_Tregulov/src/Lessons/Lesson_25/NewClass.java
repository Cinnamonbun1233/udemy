package Lessons.Lesson_25;

public class NewClass {
}

class Car {
    static int a = 5;

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(a);
        car = null;
        System.out.println(a);
    }
}