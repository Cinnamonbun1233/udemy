package JavaGetTheBlackBelt.Lesson_33;

public class Car {
    private static int a;
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(150);
        System.out.println(engine1.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        static int countOfObjects;
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(100);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
        car.method();
        System.out.println(Car.Engine.countOfObjects);
    }
}