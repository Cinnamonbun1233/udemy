package JavaGetTheBlackBelt.Lesson_27;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(10);
//        set.add(null);
        System.out.println(set);
        System.out.println(set.remove(2));
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));
        System.out.println(set);
    }
}
