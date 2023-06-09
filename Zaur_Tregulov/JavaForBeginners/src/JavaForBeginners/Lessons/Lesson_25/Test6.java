package JavaForBeginners.Lessons.Lesson_25;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(7);
        int i1 = 3;
        short s2 = (short) i1;
        byte b2 = 127;
        short s1 = 5000;
        char c1 = 100;
        long l1 = 1;
        int i2 = (int) l1;

        int i10 = 111111;
        short s10 = (short) i10;
//        System.out.println(s10);
        char c10 = (char) -8;
//        System.out.println(c10);

        int i3 = 2147483647;
        System.out.println(i3 + 1);

        int i4 = 5;
        long l2 = 10;
        System.out.println(i4 + l2);

        i4 = (int) (i4 * l2);
        i4 *= l2;

        float f = 3.14F;
        int i5 = 10;
        System.out.println(f + i5);

        byte b11 = 3;
        short s11 = 4;
        char c11 = 5;
        System.out.println(b11 + s11 + c11);

        byte b12 = 10;
        float f12 = 7F;
        double d12 = 2.0;
        System.out.println(b12 + f12 + d12);

        double d13 = 3.14;
        float f13 = 6.28F;

        float f14 = 0 * 1.5F;
        float f15 = 0 * (float) 1.5;
    }
}
