package JavaForBeginners.Lessons.Lesson_8;

public class Lesson_8 {

    public final double PI;

    Lesson_8() {
        PI = 3.14;
    }

    Lesson_8(boolean b) {
        PI = 3.14;
    }

    public static void main(String[] args) {

        Lesson_8 lesson8 = new Lesson_8();
        System.out.println(lesson8.PI);
    }

    public void abc(short s) {
        final byte b = 10;
        System.out.println(s + b);
    }
}