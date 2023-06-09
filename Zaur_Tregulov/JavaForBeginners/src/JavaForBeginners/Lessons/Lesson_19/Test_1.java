package JavaForBeginners.Lessons.Lesson_19;

public class Test_1 {

    static void sum(int... a) { //принимает любое кол-во параметров
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        sum();
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4, 5);
    }
}