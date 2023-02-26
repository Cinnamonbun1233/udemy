package JavaGetTheBlackBelt.Lesson_50;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.distinct().forEach(System.out::println);
    }
}
