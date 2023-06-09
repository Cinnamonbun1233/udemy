package JavaForBeginners.Lessons.Lesson_19;

import java.util.Arrays;

public class Test_6 {

    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};
        Arrays.fill(array, 3);

        StringBuilder[] array2 = {new StringBuilder("hello"), new StringBuilder("good buy"), new StringBuilder("ok")};
        for (StringBuilder s : array2) {
            s.replace(0,s.length(),"Hi-hi");
        }

        for (int a : array) {
            System.out.print(a + "  ");
        }

        System.out.println();

        for (StringBuilder s : array2) {
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println(array2[0]);
    }
}