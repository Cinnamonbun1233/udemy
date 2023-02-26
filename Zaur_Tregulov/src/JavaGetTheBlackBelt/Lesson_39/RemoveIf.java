package JavaGetTheBlackBelt.Lesson_39;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Uchim Java");
        arrayList.add("A imenno Lambdas");
//        arrayList.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;
        arrayList.removeIf(p);
        System.out.println(arrayList);
    }
}