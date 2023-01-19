package Lessons.Lesson_6;

public class MethodOverloading2 {

    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverloading2Test {

    public static void main(String[] args) {

        MethodOverloading2 methodOverloading2 = new MethodOverloading2();

        System.out.println(methodOverloading2.sum(5, 7));
        System.out.println(methodOverloading2.sum("Hello ", "World!"));
    }
}