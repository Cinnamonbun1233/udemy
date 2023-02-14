package Lessons.Lesson_21;

public class Test5 {
    void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
        t.abc(c);
        System.out.println('b' + 10);
    }
}