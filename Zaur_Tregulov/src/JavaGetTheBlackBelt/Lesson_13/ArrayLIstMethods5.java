package JavaGetTheBlackBelt.Lesson_13;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Коля");
        arrayList1.add("Елена");

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);
//        list1.add(100);
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        System.out.println(arrayList1);
//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);

//        for (String s : array2) {
//            System.out.println(s);
//        }

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Иван");
//        arrayList2.add("Мария");
//        arrayList2.add("Игорь");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        System.out.println(arrayList1.containsAll(arrayList2));

//        boolean result = arrayList1.contains(arrayList2);
//        System.out.println(result);

//        List<String> myList = arrayList1.subList(1,4);
//        System.out.println(myList);
//        myList.add("Фёдр");
//        System.out.println(arrayList1);
//        System.out.println(myList);
//        arrayList1.add("Света");
//        System.out.println(arrayList1);
//        System.out.println(myList);
    }
}
