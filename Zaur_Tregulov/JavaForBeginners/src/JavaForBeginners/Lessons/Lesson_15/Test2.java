package JavaForBeginners.Lessons.Lesson_15;

public class Test2 {

    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
            System.out.println("Денег осталось " + money);
        }
    }
}