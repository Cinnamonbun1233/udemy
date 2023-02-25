package JavaGetTheBlackBelt.Lesson_29;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        queue.add("Заур");
//        queue.add("Олег");
//        queue.add("Иван");
//        queue.add("Мария");
//        queue.add("Александр");
        queue.offer("Заур");
        queue.offer("Олег");
        queue.offer("Иван");
        queue.offer("Мария");
        queue.offer("Александр");
        System.out.println(queue);

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());

        System.out.println(queue.remove("Иван"));
        System.out.println(queue);

    }
}