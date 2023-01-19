package Lessons.Lesson_15;

public class Test7 {

    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("Делайте ваши ставки");
            System.out.println("Вы проиграли!");
            money -= 10;
        } while (money > 50);
    }
}
