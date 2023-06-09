package lesson_003;

import java.util.Scanner;

public class Scanner_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Введите первое число:");
        firstNumber = input.nextInt();

        System.out.println("Введите второе число:");
        secondNumber = input.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Итог вычесления: " + result);
    }
}