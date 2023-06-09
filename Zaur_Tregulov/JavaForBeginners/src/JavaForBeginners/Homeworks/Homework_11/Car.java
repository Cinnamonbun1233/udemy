package JavaForBeginners.Homeworks.Homework_11;

public class Car {

    public String color;
    public String engine;
    public int numberDoors;

    public Car(String color, String engine, int numberDoors) {
        this.color = color;
        this.engine = engine;
        this.numberDoors = numberDoors;
    }
}

class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("black", "V8", 2);
        Car car2 = new Car("white", "V6", 4);
        CarTest carTest = new CarTest();
        carTest.changeNumberDoors(car1, 4);
        System.out.println(car1.numberDoors + '\n');
        carTest.changeColor(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }

    public void changeNumberDoors(Car car, int newNumberDoors) {
        car.numberDoors = newNumberDoors;
    }

    public void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
}