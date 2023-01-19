package Lessons.Lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 3;

        double d1 = 10;
        double d2 = 4;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / c);
        System.out.println(d1 / d2);
        System.out.println(d1 % d2);

        int x = 5;
        int y = 3;
        int z = x - ++y;

        System.out.println(z);

        a += 10;
        b -= c;
        a *= c;
        b /= a;

        System.out.println(a);
        System.out.println(b);
    }
}