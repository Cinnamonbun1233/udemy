package JavaForBeginners.Lessons.Lesson_25;

public class Test8 implements interface1, interface2 {
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println(((interface1) t).a);
        ((interface1) t).abc();
        t.abc();
    }
}

interface interface1 {
    int a = 5;

    void abc();
}

interface interface2 {
    int a = 10;

    void abc();
}