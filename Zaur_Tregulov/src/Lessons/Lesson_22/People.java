package Lessons.Lesson_22;

public class People {
    String name;
    String surname;

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public People(String name) {
        this(name, null);
    }
}

class Classman extends People {

    public Classman() {
        this(5);
        System.out.println("Hello");
    }

    public Classman(int i) {
        super("Petya");
    }

    public static void main(String[] args) {
        Classman classman = new Classman();
    }
}