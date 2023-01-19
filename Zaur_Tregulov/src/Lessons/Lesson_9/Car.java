package Lessons.Lesson_9;

public class Car {

    static int count;
    String color;
    String engine;
    public int a = 10;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public static void changeA(int b) {
        Car car = new Car("black", "V8");
        car.a = b;
    }

    public static void main(String[] args) {

        Car car = new Car("red", "V6");
        System.out.println(car.color);
        car.changeColor("black");
        System.out.println(car.color);
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        changeColor("red");
    }

    public void changeColor(String color) {
        this.color = color;
    }
}