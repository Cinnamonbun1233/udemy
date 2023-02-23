package JavaGetTheBlackBelt.Lessons.Lesson_4;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Привет");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(125);
        System.out.println(info2);
        System.out.println(info1.getValue());
        System.out.println(info2.getValue());
        Integer i1 = info2.getValue();
        System.out.println(i1);
    }
}

class Info<T> {
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