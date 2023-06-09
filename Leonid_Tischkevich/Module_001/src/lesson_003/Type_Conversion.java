package lesson_003;

public class Type_Conversion {
    public static void main(String[] args) {
        int a = 10;
        byte b = (byte) a;
        short c;
        c = b;

        System.out.println(b);
        System.out.println(c);
        System.out.println((long) a);
    }
}