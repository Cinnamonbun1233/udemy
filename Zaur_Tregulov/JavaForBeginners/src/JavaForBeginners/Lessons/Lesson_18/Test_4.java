package JavaForBeginners.Lessons.Lesson_18;

import java.util.Arrays;

public class Test_4 {

    public static void main(String[] args) {

        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        Arrays.sort(array1); //сортировка массива от меньшего к большему
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        int index1 = Arrays.binarySearch(array1, 3); //поиск элемента массива
        System.out.println(index1);

        System.out.println(array1);
    }
}