package Lessons.Lesson_17;

public class Test_2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        StringBuilder sb3 = new StringBuilder("1234567");
        sb2 = sb2.append("6").append("7");
        System.out.println(sb1);
        System.out.println(sb2);

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1 == sb3);
        System.out.println(sb1.equals(sb3));
    }
}