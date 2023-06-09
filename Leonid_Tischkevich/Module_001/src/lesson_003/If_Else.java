package lesson_003;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        String inputFirstNumber = "Введите первое число:";
        String inputSecondNumber = "Введите второе число:";
        String firstIsBigger = "Первое число больше второго числа";
        String secondIsBigger = "Второе число больше первого числа";
        String numbersAreEquals = "Числа равны";

        System.out.println(inputFirstNumber);
        firstNumber = scanner.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstIsBigger);
        } else if (firstNumber == secondNumber) {
            System.out.println(numbersAreEquals);
        } else {
            System.out.println(secondIsBigger);
        }
    }
}