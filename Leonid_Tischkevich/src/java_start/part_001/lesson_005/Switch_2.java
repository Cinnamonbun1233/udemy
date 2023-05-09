package java_start.part_001.lesson_005;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление," +
                " 4 - деление с остатком");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1 -> System.out.println("Сумма элементов = " + (firstNumber + secondNumber));
            case 2 -> System.out.println("Разница элементов = " + (firstNumber - secondNumber));
            case 3 -> System.out.println("Деление элементов = " + (firstNumber / secondNumber));
            case 4 -> System.out.println("Остаток от деления элементов = " + (firstNumber % secondNumber));
            default -> System.out.println("Введена неверная операция");
        }
    }
}