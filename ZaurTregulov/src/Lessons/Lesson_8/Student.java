package Lessons.Lesson_8;

public class Student {

    public static int count;
    String name;
    int course;
    int a;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Студент номер " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Всего создано студентов " + count);
    }

    public static void main(String[] args) {
        Student st2 = new Student("Ivan", 2);
        abcd();
        st2.abc();
    }

    static void abcd() {
        count++;
        Student st1 = new Student("Petr", 1);
        st1.a++;
    }

    public void showInfo() {
        System.out.println("Welcome to the class!");
    }

    void abc() {
        a++;
        count++;
    }
}