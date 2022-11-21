package Homeworks.Homework_15;

public class Time {

    public static void main(String[] args) {
        time();
    }

    //System.out.println(hour + ":" + minute + ":" + second);

    public static void time() {
        int hour = 0;
        while (true) {
            int minute = -1;
            do {
                minute++;
                int second = 0;
                while (second < 60) {
                    if ((second * hour) > minute) {
                        break;
                    } else {
                        System.out.println(hour + ":" + minute + ":" + second);
                    }
                    second++;
                }
            } while (minute < 59);
            hour++;
            if (hour > 1) {
                break;
            }
        }
    }
}