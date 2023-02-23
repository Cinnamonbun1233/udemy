package JavaForBeginners.Lessons.Lesson_27;

public class Test6 {
    void abc() {
        int[] array = {1, 2};
        System.out.println(array[5]);
    }

    void def() {
        abc();
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        try {
            t.def();
        } catch (Exception e) {
            System.out.println("Exception пойман");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}