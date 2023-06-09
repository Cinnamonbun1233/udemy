package JavaForBeginners.Lessons.Lesson_26;

import java.util.ArrayList;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        System.out.println("----------");

        Car c4 = new Car("black","V8");
        System.out.println(list.contains(c4));
        System.out.println(c1);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}