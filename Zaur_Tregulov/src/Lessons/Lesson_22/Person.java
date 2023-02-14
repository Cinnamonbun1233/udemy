package Lessons.Lesson_22;

public class Person {
    protected String name = "Kolya";
    protected static int salary = 150;

    protected void work() {
        System.out.println("Работать");
    }

    protected static void rest() {
        System.out.println("Отдыхать");
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}