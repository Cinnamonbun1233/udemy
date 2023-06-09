package JavaForBeginners.Homeworks.Homework_29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Работаем с: " + ldt1.format(dateTimeFormatter1));
            ldt1 = ldt1.plus(p);
            System.out.println(" до: " + ldt1.format(dateTimeFormatter1));
            System.out.print("Отдыхаем с: " + ldt1.format(dateTimeFormatter2));
            ldt1 = ldt1.plus(d);
            System.out.println(" до: " + ldt1.format(dateTimeFormatter2));
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 1, 1, 9, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 2, 3, 9, 0);
        Period period = Period.ofWeeks(1);
        Duration duration = Duration.ofHours(1);
        main.shift(localDateTime1, localDateTime2, period, duration);
    }
}