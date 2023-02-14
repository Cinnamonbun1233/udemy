package Lessons.Lesson_21;

public class Test3 {
    Test3() {
        System.out.println("Это конструктор");
    }

    void Test3() {
        System.out.println("Это метод");
    }

    int Test3 = 5;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}