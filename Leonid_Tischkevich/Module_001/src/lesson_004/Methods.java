package lesson_004;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first;
        int second;

        System.out.println("Введите первое число:");
        first = scanner.nextInt();

        System.out.println("Введите второе число:");
        second = scanner.nextInt();

        int resultSum = sum(first, second);
        System.out.println("Сумма = " + resultSum);
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}