package Homeworks.Homework_14;

public class Homework_14 {

    public static void time() {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    if ((second * hour) > minute ){
                        continue ;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }

        }
    }

    public static void main(String[] args) {
        time();
    }
}