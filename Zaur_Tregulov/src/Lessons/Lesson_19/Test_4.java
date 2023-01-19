package Lessons.Lesson_19;

public class Test_4 {

    public static void main(String[] args) {

        String[] students = {"Иванов", "Петров", "Сидоров"};
        String[] exams = {"математика", "философия"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println("Студент: " + student + ", экзамен: " + exam);
            }
        }
    }
}