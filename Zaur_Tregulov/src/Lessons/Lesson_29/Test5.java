package Lessons.Lesson_29;

import java.time.LocalDate;
import java.time.Month;

public class Test5 {
    static void changeOfSenior(LocalDate start, LocalDate finish) {
        LocalDate date = start;
        while (date.isBefore(finish)) {
            System.out.println("Наступила дата " + date + ". Пора менять дежурного.");
            date = date.plusMonths(1);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate finish = LocalDate.of(2017, Month.MAY, 31);
        changeOfSenior(start, finish);
    }
}