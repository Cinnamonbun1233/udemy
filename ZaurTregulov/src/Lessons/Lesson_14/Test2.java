package Lessons.Lesson_14;

public class Test2 {

    static void abc(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        int i, k;
        for (i = 5, k = 5; i < 11 && k != 15; k += 2, abc(10)) {
            System.out.println(i);
            abc(15);
            i++;
        }
    }
}