package JavaForBeginners.Lessons.Lesson_19;

public class Test_7 {

    public static void main(String[] args) {

        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}