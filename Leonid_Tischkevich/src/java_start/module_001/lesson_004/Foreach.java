package java_start.module_001.lesson_004;

import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println("Элемент: " + number);
        }
    }
}
