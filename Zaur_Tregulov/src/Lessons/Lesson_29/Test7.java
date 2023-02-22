package Lessons.Lesson_29;

import java.time.*;

public class Test7 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        LocalTime lt = LocalTime.of(10, 30);
        Period period = Period.ofMonths(3);
        Duration duration = Duration.ofMinutes(15);
        System.out.println(ldt.plus(duration).plus(period));
    }
}