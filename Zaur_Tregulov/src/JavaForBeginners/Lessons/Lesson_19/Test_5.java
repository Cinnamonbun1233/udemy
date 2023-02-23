package JavaForBeginners.Lessons.Lesson_19;

public class Test_5 {

    public static void main(String[] args) {

        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}