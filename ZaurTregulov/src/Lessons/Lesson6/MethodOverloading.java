package Lessons.Lesson6;

public class MethodOverloading {

    void show(int i) {
        System.out.println(i);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }

    void show(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }
}

class MethodOverloadingTest {

    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();

        methodOverloading.show(10);
        methodOverloading.show(true);
        methodOverloading.show("Привет");
        methodOverloading.show("Привет", 12);
    }
}