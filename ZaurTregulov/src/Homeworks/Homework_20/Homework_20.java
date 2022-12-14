package Homeworks.Homework_20;

import java.util.ArrayList;
import java.util.Collections;

public class Homework_20 {

    public static ArrayList<String> abc(String... s) {
        ArrayList<String> list = new ArrayList<>();
        for (String st : s) {
            if (!list.contains(st)) {
                list.add(st);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {

        abc("D", "C", "A", "D", "B", "A", "B");
    }
}