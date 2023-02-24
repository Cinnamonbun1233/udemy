package JavaGetTheBlackBelt.Lesson_19;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Заур");
        stack.push("Миша");
        stack.push("Олег");
        stack.push("Катя");
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

//        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}