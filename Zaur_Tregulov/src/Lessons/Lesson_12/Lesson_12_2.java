package Lessons.Lesson_12;

public class Lesson_12_2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        Lesson_12_2 t = new Lesson_12_2();
        t.max(4, 7, 0);

        int maximum = (a > b) ? a : b;
        System.out.println(maximum);
    }

    void max(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Максимум - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Максимум - " + i2);
        } else {
            System.out.println("Максимум - " + i3);
        }
    }

    void abc() {

        String str;
        int a = 10;

        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }
}