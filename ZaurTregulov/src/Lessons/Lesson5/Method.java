package Lessons.Lesson5;

public class Method {

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int averageNumber(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }
}

class MethodTest {

    public static void main(String[] args) {

        Method method = new Method();
        int sumThreeNumbers = method.sum(1, 2, 3);
        System.out.println(sumThreeNumbers);
        System.out.println(method.sum(2, 3, 4));
        System.out.println(method.averageNumber(20, 40, 60));
    }
}