package lesson_001;

public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int firstNumber = 5;
        int secondNumber = 10;

        int sum;
        int subtraction;
        int multiplication;
        int division;
        int reminder;

        sum = firstNumber + secondNumber;
        subtraction = secondNumber - firstNumber;
        multiplication = firstNumber * secondNumber;
        division = secondNumber / firstNumber;
        reminder = firstNumber % secondNumber;

        showActions(sum, subtraction, multiplication, division, reminder);
    }

    private static void showActions(int sum, int subtraction, int multiplication, int division, int reminder) {
        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + division);
        System.out.println("Остаток от деления: " + reminder);
    }
}