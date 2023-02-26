package JavaGetTheBlackBelt.Lesson_37;

interface I {
    int abc(String s);
}

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("String"));
    }

    public static void main(String[] args) {
        def(String::length);
    }
}