package JavaForBeginners.Lessons.Lesson_24;

public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square();
        f1.area();
    }
}

abstract class Figure {
//    Figure(int numberOfSides) {
//        this.numberOfSides = numberOfSides;
//    }

    int numberOfSides = 0;

    abstract void perimeter();

    abstract void area();

    void showInfo() {
        System.out.println("Это фигруа");
    }
}

class Square extends Figure {
//    Square(int numberOfSides) {
//        super(numberOfSides);
//        this.numberOfSides = numberOfSides;
//    }

    int numberOfSides = 4;
    int side1 = 10;

    public void perimeter() {
        System.out.println("Периметр квадрата = " + (4 * side1));
    }

    public void area() {
        System.out.println("Площадь квадрата = " + (side1 * side1));
    }

}

class Rectangle extends Figure {
    int numberOfSides = 4;
    int side1 = 10;
    int side2 = 5;

    public void perimeter() {
        System.out.println("Периметр квадрата = " + (2 * (side1 + side2)));
    }

    public void area() {
        System.out.println("Площадь квадрата = " + (side1 * side2));
    }
}

class Circle extends Figure {
    int radius = 10;

    public void perimeter() {
        System.out.println("Периметр квадрата = " + (2 * 3.14 * radius));
    }

    public void area() {
        System.out.println("Площадь квадрата = " + (3.14 * (radius * radius)));
    }
}

abstract class Quadrilateral extends Figure {
    void def() {
        System.out.println("Это четырехугольник");
    }
}