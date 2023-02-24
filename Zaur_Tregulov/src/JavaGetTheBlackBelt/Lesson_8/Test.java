package JavaGetTheBlackBelt.Lesson_8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        System.out.println(sum(list1));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(3);
        list3.add(3);
        showListInfo(list3);
        System.out.println(sum(list3));

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Ok");
        System.out.println(list5);
        showListInfo(list5);
//        System.out.println(sum(list5));

        List<String> list2 = new ArrayList<>();
        list2.add("Ok");
        list2.add("Privet");
        list2.add("Poka");
        showListInfo(list2);

        List<? extends Number> list4 = new ArrayList<>();
        List<? super Number> list6 = new ArrayList<>();
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
