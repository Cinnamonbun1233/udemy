package Lesson4;

public class Car {

    String color = "red";
    String engine = "V6";
}

class CarType {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = car1;
        car1.color = "black";
        car1.engine = "V8";

        System.out.println(car2.engine);
        System.out.println(new Car().color);

        System.out.print("Цвет: ");
        System.out.println(car1.color);
        System.out.print("Мотор: ");
        System.out.println(car1.engine);
    }
}