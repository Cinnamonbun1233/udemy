package Lessons.Lesson_14;

public class Test4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            } else if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}