package JavaGetTheBlackBelt.Lesson_14;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Коля");
        arrayList1.add("Елена");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
           iterator.next();
           iterator.remove();
        }
    }
}