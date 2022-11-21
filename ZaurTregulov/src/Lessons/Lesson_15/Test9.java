package Lessons.Lesson_15;

public class Test9 {

    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            while (minute < 60) {
                if (minute == 20) {
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 6);
    }
}