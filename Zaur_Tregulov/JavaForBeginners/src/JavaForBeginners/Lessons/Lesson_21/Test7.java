package JavaForBeginners.Lessons.Lesson_21;

public class Test7 {
    public void abc(int a, double b) {
        System.out.println("Privet");
    }

    public void abc(double a, int b) {
        System.out.println("Poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        //t.abc(1,2); ошибка компилятора
        t.abc(1.7,2);
    }
}