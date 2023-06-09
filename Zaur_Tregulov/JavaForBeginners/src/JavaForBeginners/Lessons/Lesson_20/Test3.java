package JavaForBeginners.Lessons.Lesson_20;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (StringBuilder stringBuilder : list) {
            stringBuilder.append("!!!");
        }

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

        list.remove(2);
        System.out.println();

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
    }
}