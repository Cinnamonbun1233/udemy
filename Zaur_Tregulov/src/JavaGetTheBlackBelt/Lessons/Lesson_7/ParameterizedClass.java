package JavaGetTheBlackBelt.Lessons.Lesson_7;

interface I1 {

}

interface I2 {

}

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<Integer> list = new Info<>(100);
//        System.out.println(list);
//        Integer i = list.getValue();
    }
}

class Info<T extends Number & I1 & I2> {
    private final T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Bus {

}