package JavaForBeginners.Lessons.Lesson_13;

public class Employee {

    public static void main(String[] args) {

        switch ("Вторник") {
            case "Понедельник", "Вторник", "Среда", "Четверг" -> System.out.println("Работа до 18:00");
            case "Пятница" -> System.out.println("Работа до 14:00");
            case "Суббота", "Воскресенье" -> System.out.println("Выходной");
            default -> System.out.println("Неправильно введен день недели");
        }
    }
}