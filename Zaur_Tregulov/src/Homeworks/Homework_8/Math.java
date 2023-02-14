package Homeworks.Homework_8;

public class Math {

    public static int multiplicationThreeNumbers(int a, int b, int c) {
        return a * b * c;
    }

    public static void dividingTwoNumbers(int a, int b) {
        System.out.println("Результат деления " + a + " на " + b + ": целое частное - " + a / b + " и остаток - " + a % b);
    }
}

class MathTest {

    public static void main(String[] args) {

        System.out.println(Math.multiplicationThreeNumbers(1, 2, 3));
        Math.dividingTwoNumbers(14, 6);
    }
}