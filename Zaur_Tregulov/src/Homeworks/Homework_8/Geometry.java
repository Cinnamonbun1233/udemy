package Homeworks.Homework_8;

public class Geometry {

    static final double PI = 3.14;

    public static double circumferenceLength(double radius) {
        return 2 * PI * radius;
    }

    public double circleArea(double radius) {
        return PI * radius * radius;
    }

    public void info(double radius) {
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь круга: " + circleArea(radius));
        System.out.println("Длина окружности: " + circumferenceLength(radius));
    }
}

class GeometryTest {
    public static void main(String[] args) {

        Geometry geometry = new Geometry();
        geometry.info(10);
        System.out.println(geometry.circleArea(25));
        System.out.println(Geometry.circumferenceLength(60));
    }
}