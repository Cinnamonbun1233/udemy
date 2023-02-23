package JavaForBeginners.Lessons.Lesson_30;

public class Test4 {
    static void def(Test5 test5) {
        System.out.println(test5.abc("Привет"));
    }

   /* static void def(Test5 test5) {
        System.out.println(test5.abc());
    }*/

    public static void main(String[] args) {
        def(x -> x.length());
    }
}

interface Test5 {
    int abc(String s);
}