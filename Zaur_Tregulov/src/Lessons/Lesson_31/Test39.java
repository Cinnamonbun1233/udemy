package Lessons.Lesson_31;

public class Test39 {
}

class Test {
    static String s = "";

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8};
        for (int a : array) {
            for (int j = 0; j < 4; j++) {
                if (a > 1.5 && a < 6) {
                    continue;
                }
                System.out.println(a);
                if (j == 1) break;
                continue;
            }
            continue;
        }
    }
}