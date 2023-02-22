package Lessons.Lesson_29;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        ld1 = ld1.plusDays(20);
        System.out.println(ld1);
        ld1 = ld1.minusDays(7);
        System.out.println(ld1);
        ld1 = ld1.plusWeeks(1);
        System.out.println(ld1);
        ld1 = ld1.minusMonths(2);
        System.out.println(ld1);
        ld1 = ld1.minusMonths(1).plusWeeks(2).plusDays(4).minusWeeks(12);
        System.out.println(ld1);
    }
}