package java_start.module_001.lesson_015;

public class LinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("XYZ");

        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());

        list.addFirst("AAA");
        System.out.println(list.get(0));
        list.delete(2);
        System.out.println(list.size());
        System.out.println("\n");

        for (String element : list){
            System.out.println(element);
        }
    }
}