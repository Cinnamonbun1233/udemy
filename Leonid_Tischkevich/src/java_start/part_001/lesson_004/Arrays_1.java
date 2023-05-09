package java_start.part_001.lesson_004;

import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println("Значение индекса = " + i + ", значение элемента = " + array[i]);
        }
    }
}