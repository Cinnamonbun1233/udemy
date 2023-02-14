package Homeworks.Homework_6;

public class Homework6 {

    int sum() {
        return 0;
    }

    int sum(int a) {
        return sum() + a;
    }

    int sum(int a, int b) {
        return sum(a) + b;
    }

    int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }

    int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }
}

class Homework6Test {
    public static void main(String[] args) {

        Homework6 homework6 = new Homework6();

        System.out.println(homework6.sum());
        System.out.println(homework6.sum(1));
        System.out.println(homework6.sum(1, 2));
        System.out.println(homework6.sum(1, 2, 3));
        System.out.println(homework6.sum(1, 2, 3, 4));
    }
}