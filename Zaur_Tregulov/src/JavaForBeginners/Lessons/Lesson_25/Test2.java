package JavaForBeginners.Lessons.Lesson_25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpable) {
            System.out.println("j is jumpable");
        }
        if (m instanceof Human) {
            System.out.println("m is jumpable");
        }
//        if (s instanceof Human) {
//            System.out.println("s is jumpable");
//        }
        if (s instanceof Jumpable) {
            System.out.println("s is jumpable");
        }
    }
}

interface Jumpable {
}

class Human implements Jumpable {
}

class Man extends Human {
}

class Student {
}