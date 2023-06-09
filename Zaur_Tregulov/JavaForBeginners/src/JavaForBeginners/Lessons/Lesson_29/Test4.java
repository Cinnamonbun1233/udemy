package JavaForBeginners.Lessons.Lesson_29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test4 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 31);
        LocalDate ld2 = LocalDate.of(2014, Month.JULY, 18);
        System.out.println(ld1.isAfter(ld2));

        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(3, 5, 18, 55598);
        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25);
        LocalDateTime ldt2 = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25, 9);
        System.out.println(ldt1.isEqual(ldt2));
    }
}
