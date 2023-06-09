package lesson_014;

public class LinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("ABC");
        customLinkedList.add("DEF");
        customLinkedList.add("XYZ");

        System.out.println(customLinkedList.get(1));
    }
}