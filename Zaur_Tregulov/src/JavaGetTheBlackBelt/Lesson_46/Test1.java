package JavaGetTheBlackBelt.Lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> optionalInteger = list100.stream().reduce((accumulator, element) -> accumulator * element);
        Optional<Integer> optionalInteger1 = list.stream().reduce((accumulator, element) -> accumulator * element);

        System.out.println(result);

        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("Не присутствует");
        }

        if (optionalInteger1.isPresent()) {
            System.out.println(optionalInteger1.get());
        } else {
            System.out.println("Не присутствует");
        }

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("bye");

        String result3 = list3.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result3);
    }
}