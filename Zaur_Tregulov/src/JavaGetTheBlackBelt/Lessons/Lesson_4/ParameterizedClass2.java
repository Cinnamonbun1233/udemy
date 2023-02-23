package JavaGetTheBlackBelt.Lessons.Lesson_4;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Привет", 20);
        System.out.println("Значение пары: value1: " + pair1.getFirstValue() + ", value2: " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(125, 177.17);
        System.out.println("Значение пары: value1: " + pair2.getFirstValue() + ", value2: " + pair2.getSecondValue());

        OtherPair<Integer> pair3 = new OtherPair<>(125, 255);
        System.out.println("Значение пары: value1: " + pair3.getFirstValue() + ", value2: " + pair3.getSecondValue());
    }
}

class Pair<V1, V2> {
    private final V1 value1;
    private final V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private final V value1;
    private final V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}