package java_start.module_002.lesson_003.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int[] array = new int[]{2, 4, 1, 9, 5, 30, 15};
        fillCollection(arrayList, array);
        fillCollection(linkedList, array);
        fillCollection(hashSet, array);
        fillCollection(treeSet, array);

        System.out.println("ArrayList");
        printCollection(arrayList);

        System.out.println("linkedList");
        printCollection(linkedList);

        System.out.println("HashSet");
        printCollection(hashSet);

        System.out.println("TreeSet");
        printCollection(treeSet);
    }

    private static void fillCollection(Collection<Integer> collection, int[] array) {
        for (int element : array) {
            collection.add(element);
        }
    }

    private static void printCollection(Collection<Integer> collection) {
        for (Integer element : collection) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }
}