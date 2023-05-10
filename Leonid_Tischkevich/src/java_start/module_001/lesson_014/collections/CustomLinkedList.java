package java_start.module_001.lesson_014.collections;

public class CustomLinkedList<Element> {
    private Node<Element> first;
    private Node<Element> last;

    public void add(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
        } else {
            Node<Element> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
        }
    }

    public Element get(int index) {
        Node<Element> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.item;
    }

    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}