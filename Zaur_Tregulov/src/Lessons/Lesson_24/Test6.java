package Lessons.Lesson_24;

public class Test6 {
}

interface I1 {
    default void abc() {
        System.out.println("это метод abc");
    }

    static void def() {
        System.out.println("static method 1");
    }
}

interface I2 extends I1 {
//    default void abc() {
//        System.out.println("это метод abc!!!");
//    }

    void abc();

    static void def() {
        System.out.println("static method 2");
    }
}

abstract class R implements I1, I2 {
//    public void abc() {
//        System.out.println("это метод abc!!!");
//    }

    public abstract void abc();

    public static void main(String[] args) {
        I1.def();
        I2.def();
    }
}