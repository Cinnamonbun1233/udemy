package Lessons.Lesson_14;

public class Test5 {

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time();
    }

    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
                if (minute == 30) {
                    break OUTER;
                } else if (minute == 20) {
                    continue OUTER;
                }
            }
        }
    }
}