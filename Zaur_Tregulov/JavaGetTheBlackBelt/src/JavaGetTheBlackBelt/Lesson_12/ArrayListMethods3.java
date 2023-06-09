package JavaGetTheBlackBelt.Lesson_12;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Иван");
        System.out.println(arrayList1);
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(2, arrayList2);
//        System.out.println(arrayList1);
//        arrayList2.clear();
//        System.out.println(arrayList2);
        System.out.println(arrayList1.indexOf("Иван"));
        System.out.println(arrayList1.lastIndexOf("Иван"));
        System.out.println(arrayList1.size());
//        arrayList1.clear();
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Николай"));
        System.out.println(arrayList1.contains("Мария"));
    }
}