package Lessons.Lesson_20;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("hello");
        list.add("poka");

        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        System.out.println(list.indexOf("poka"));
        System.out.println(list.lastIndexOf("poka"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));
        System.out.println(list.toString());
    }
}