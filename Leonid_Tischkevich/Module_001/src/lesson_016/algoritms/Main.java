package lesson_016.algoritms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        System.out.println(linearSearch(list, "BBB"));
        System.out.println("\n");

        int[] mass = new int[]{8, 12, 2, 5, 89, 4, 15, 29};
        bubbleSort(mass);
        for (int element : mass){
            System.out.print(element + " ");
        }
    }

    private static int linearSearch(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}