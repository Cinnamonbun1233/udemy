package java_start.module_001.lesson_014.collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }

        System.out.println(intList.size());

        for (Integer element : intList) {
            if (element % 15 == 0) {
                System.out.println(element);
            }
        }
    }
}