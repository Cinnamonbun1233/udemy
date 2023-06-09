package JavaGetTheBlackBelt.Lesson_10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Заур");
        arrayList2.add("Иван");
        List<String> arrayList3 = new ArrayList<>(200);
        List<String> arrayList4 = new ArrayList<>(arrayList2);
        System.out.println(arrayList4);
        System.out.println(arrayList2 == arrayList4);
    }
}