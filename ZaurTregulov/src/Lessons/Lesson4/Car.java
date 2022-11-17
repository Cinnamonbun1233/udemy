package Lessons.Lesson4;

public class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
        System.out.println("Объект создан!");
    }

    Car() {
        color = "blue";
        engine = "V12";
    }
}

class CarType {

    public static void main(String[] args) {

        Car car1 = new Car("white", "V12");
        car1.color = "black";
        car1.engine = "V8";
        Car car2 = new Car();

        System.out.println(car1.engine);
        System.out.println(new Car("black", "V6").color);

        System.out.print("Цвет: ");
        System.out.println(car1.color);
        System.out.print("Мотор: ");
        System.out.println(car1.engine);
        System.out.println(car2.engine);
    }
}