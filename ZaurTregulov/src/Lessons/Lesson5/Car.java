package Lessons.Lesson5;

public class Car {

    String color;
    String engine;
    int speed;

    int speedUp(int gaz) {
        speed += gaz;
        return speed;
    }

    int speedDown(int tormoz) {
        speed -= tormoz;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет: " + color + ", мотор: " + engine + ", скорость: " + speed);
    }
}

class CarTest {

    public static void main(String[] args) {

        Car car = new Car();

        car.color = "white";
        car.engine = "V6";
        car.speed = 60;

        car.showInfo();
        car.speedUp(20);
        car.speedDown(60);
        car.showInfo();
    }
}