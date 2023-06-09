package JavaForBeginners.Lessons.Lesson_16;

public class Car {

    final static int a = 5;
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "V6");
        Car c2 = c1.adc("black");
        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println(c2.engine);
    }

    public Car adc(String color) {
        Car c = new Car(color, "V4");
        return c;
    }
}