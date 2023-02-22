package Lessons.Lesson_29;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test6 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        Period period = Period.ofDays(10);
        System.out.println(start.plus(period));
    }
}