package JavaGetTheBlackBelt.Lesson_26;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Заур");
        set.add("Олег");
        set.add("Марина");
        set.add("Игорь");
//        set.add("Игорь");
//        set.add(null);
        set.remove("Заур");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Миша"));
        System.out.println(set.contains("Марина"));

//        for (String s : set) {
//            System.out.println(s);
//        }

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(8);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(set1);
        subtract.removeAll(set2);
        System.out.println(subtract);
    }
}
