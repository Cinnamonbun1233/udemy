package JavaGetTheBlackBelt.Lesson_11;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add(1, "Миша");

        System.out.println(arrayList1);

        for (String string : arrayList1) {
            System.out.print(string + " ");
        }

        System.out.println();
        System.out.println(arrayList1.get(2));

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + ", ");
        }

        System.out.println();
        arrayList1.set(1, "Маша");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}