package JavaGetTheBlackBelt.Lesson_37;

interface I {
    int abc(String s);
//    int abc();
}

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Privet"));
    }

    public static void main(String[] args) {
//        def(() -> 18);
        int i = 10;
        def(String::length);
    }
}