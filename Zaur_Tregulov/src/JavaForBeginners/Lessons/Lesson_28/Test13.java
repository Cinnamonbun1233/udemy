package JavaForBeginners.Lessons.Lesson_28;

public class Test13 {
    void abc() {
        System.out.println("Метод abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("Это finally блок");
        }
    }

    public static void main(String[] args) {
        Test13 t = new Test13();
        t.def();
    }
}
