package java_start.part_001.lesson_005;

import java.util.Random;
import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }

        System.out.println("Введите число для поиска в массиве:");
        int findNumber = scanner.nextInt();

        for (int number : array) {
            if (number == findNumber) {
                System.out.println(number);
            } else {
                System.out.println("Загаданое число не найдено");
            }
        }

        int max = array[0];
        for (int number : array){
            if (number > max){
                max = number;
            }
        }

        System.out.println("Максимальное значение в массиве: " + max);
    }
}