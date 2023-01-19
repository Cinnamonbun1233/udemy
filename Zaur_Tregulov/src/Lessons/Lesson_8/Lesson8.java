package Lessons.Lesson_8;

public class Lesson8 {

    public final double PI;

    Lesson8() {
        PI = 3.14;
    }

    Lesson8(boolean b) {
        PI = 3.14;
    }

    public static void main(String[] args) {

        Lesson8 lesson8 = new Lesson8();
        System.out.println(lesson8.PI);
    }

    public void abc(short s) {
        final byte b = 10;
        System.out.println(s + b);
    }
}