package JavaGetTheBlackBelt.Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("Ok");
//        list.add(5);
//        list.add(new StringBuilder("Privet"));
//        list.add(new Car());

        list.add("Привет");
        list.add("Пока");
        list.add("Как дела?");
//        list.add(new Car());

        for (Object object : list) {
            System.out.println(object + " length " + ((String) object).length());
        }
    }
}

class Car {

}