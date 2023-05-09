package java_start.part_001.lesson_004;

import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        printArray(array);
        printDayOfWeek(7);
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println("Элемент: " + number);
        }
    }

    public static void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Введено неправильное число");
        }
    }
}