package Lessons.Lesson_12;

public class Lesson_12_1 {

    public static void main(String[] args) {

        int salary = 300;

        int a = 30;
        boolean b = true;

        if (a < 20) {
            System.out.println("a < 20");
        } else {
            System.out.println("a > 20");
        }

        if (salary >= 500) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        if (salary < 200) {
            System.out.println("ЗП очень низкая");
        } else if (salary < 400 && b == false || true) {
            System.out.println("ЗП среднего размера");
        } else if (salary < 600) {
            System.out.println("ЗП высокая");
        } else {
            System.out.println("ЗП отличная");
        }


    }
}