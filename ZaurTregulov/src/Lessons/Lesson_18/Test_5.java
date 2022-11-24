package Lessons.Lesson_18;

public class Test_5 {

    public static void main(String[] args) {

        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array2 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array3 = array1;

        System.out.println(array1 == array2);
        System.out.println(array1 == array3);

        System.out.println(array1.equals(array2));
        System.out.println(array1.equals(array3));
    }
}