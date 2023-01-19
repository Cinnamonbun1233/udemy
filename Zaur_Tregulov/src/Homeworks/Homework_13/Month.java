package Homeworks.Homework_13;

public class Month {

    public void month(int a) {
        switch (a) {
            case 1, 3, 5, 7, 9, 11 -> System.out.println("В месяце 31 день");
            case 4, 6, 8, 10, 12 -> System.out.println("В месяце 30 день");
            case 2 -> System.out.println("В месяце 29 день");
            default -> System.out.println("Укажите верный номер месяца");
        }
    }

    public static void main(String[] args) {

        Month month = new Month();
        month.month(5);
    }
}