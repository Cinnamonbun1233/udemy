package JavaGetTheBlackBelt.Lesson_40;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Test {
    public static ArrayList<Car> createCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createCars(() -> new Car("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "Red";
            car.engine = 2.4;
            System.out.println("Обновленная машина = " + car);
        });
        System.out.println(ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}