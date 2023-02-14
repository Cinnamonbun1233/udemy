package Lessons.Lesson_20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));
        list.add(4, new StringBuilder("ok"));

        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        list.addAll(1, list2);
        System.out.println();

        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        list2.get(1).append("!!!");
        System.out.println();

        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
    }
}