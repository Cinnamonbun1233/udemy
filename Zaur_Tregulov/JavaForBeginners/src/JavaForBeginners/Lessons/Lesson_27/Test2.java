package JavaForBeginners.Lessons.Lesson_27;

public class Test2 {
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3,};

        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение поймано");
        }
    }
}