package JavaForBeginners.Lessons.Lesson_28;

import java.io.IOException;

public class Test14 {
    public static void main(String[] args) {
        Animal a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            System.out.println("Exception пойман");
        }
    }
}

class Animal {
    void run() throws IOException, ArrayIndexOutOfBoundsException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal {
    @Override
    void run() throws IndexOutOfBoundsException, NullPointerException {
        System.out.println("Mouse runs");
    }
}