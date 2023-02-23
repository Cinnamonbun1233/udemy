package JavaForBeginners.Lessons.Lesson_28;

public class Test5 {

    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
//            try {
                System.out.println(s.length());
//            } catch (NullPointerException e2) {
//                System.out.println("Это внутренний NullPointerException");
//            }
        } catch (NullPointerException e) {
            System.out.println("Пойман NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.abc();
    }
}
