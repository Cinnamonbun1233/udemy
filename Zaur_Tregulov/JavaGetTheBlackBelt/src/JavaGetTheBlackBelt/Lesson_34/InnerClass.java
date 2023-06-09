package JavaGetTheBlackBelt.Lesson_34;

public class InnerClass {
}

class Car {
    //    private static int a;
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//    void method() {
//        System.out.println(Engine.countOfObjects);
//        Engine engine1 = new Engine(150);
//        System.out.println(engine1.horsePower);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        public final static int a = 5;
        //        static int countOfObjects;
        private final int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
//            countOfObjects++;
//            System.out.println(a);
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
//        Car.Engine engine = new Car.Engine(100);
//        System.out.println(engine);
//        Car car = new Car("red", 2, engine);
//        System.out.println(car);
//        car.method();
//        System.out.println(Car.Engine.countOfObjects);

//        Car car = new Car("black", 4, 300);
//        System.out.println(car);

        Car car = new Car("black", 4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine1 = new Car("red", 4).new Engine(150);
        System.out.println(engine1);
    }
}