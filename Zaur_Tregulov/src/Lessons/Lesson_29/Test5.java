package Lessons.Lesson_29;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test5 {
    static void changeOfSenior(LocalDate start, LocalDate finish, Period period) {
        LocalDate date = start;
        while (date.isBefore(finish)) {
            System.out.println("Наступила дата " + date + ". Пора менять дежурного.");
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate finish = LocalDate.of(2017, Month.MAY, 31);
        Period period = Period.ofWeeks(3);
        changeOfSenior(start, finish,period);
    }
}