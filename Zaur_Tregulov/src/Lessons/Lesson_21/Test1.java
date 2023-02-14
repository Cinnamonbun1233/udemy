package Lessons.Lesson_21;

public class Test1 {

    public static void main(String[] args) {

        //int a = 4;
        //System.out.println(a < 4 ? 7 : "Privet"); правильное написание тернантного оператора
        //int b = (a < 4) ? 7 : "privet"; так писать нельзя

        int a = 5;
        int b = 5;
        int c = (a < 6) ? a++ : b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}