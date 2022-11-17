package Lessons.Lesson8;

public class Car {

    String color = "blue";
    String engine = "V6";
}

class Human {

    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {

        Human h = new Human();
        h.c = new Car();
        h.c = new Car();
        h.c.engine = "V8";
    }
}