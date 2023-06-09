package JavaForBeginners.Lessons.Lesson_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        ArrayList<StringBuilder> list3 = list1;

//        System.out.println(list1 == list2);
//        System.out.println(list1.get(0) == list2.get(0));
//        list1.get(0).append("!!!");
//        list1.set(0, new StringBuilder("D"));
//        System.out.println(list2.get(0));

        Object[] array1 = list1.toArray();
        for (Object o : array1) {
            System.out.print(o + " ");
        }

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        System.out.println();

        for (StringBuilder sb : array2) {
            System.out.print(sb + " ");
        }
        System.out.println();

        StringBuilder[] array = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
        array[0].append("!!!");
        array[1] = new StringBuilder("!!!!");
        System.out.println(list8);
    }
}