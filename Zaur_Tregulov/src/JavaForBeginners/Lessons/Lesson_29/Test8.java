package JavaForBeginners.Lessons.Lesson_29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test8 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(16, 40);
        LocalDate localDate = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime localDateTime = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);

//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDateTime.getDayOfWeek());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDateTime.getDayOfYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDateTime.getHour());
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());

//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(localDate);
//        System.out.println(localDate.format(dateTimeFormatter1));
//        System.out.println(localTime);
//        System.out.println(localTime.format(dateTimeFormatter2));

//        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(localDate);
//        System.out.println(localDate.format(dateTimeFormatter4));

//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        System.out.println(localDate);
//        System.out.println(localDate.format(shortFormat));
//        System.out.println(localDateTime);
//        System.out.println(localDateTime.format(shortFormat));
//        System.out.println(localTime);
//        System.out.println(localTime.format(shortFormat1));
//        System.out.println(localDateTime);
//        System.out.println(localDateTime.format(shortFormat2));

//        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//        System.out.println(localDateTime);
//        System.out.println(localDateTime.format(dateTimeFormatter5));

        DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", dateTimeFormatter6);
        System.out.println(date1);
    }
}