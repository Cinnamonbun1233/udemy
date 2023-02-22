package Lessons.Lesson_28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test15 {
    public static void main(String[] args) {
//        Animal1 a = new Mouse1();
    }
}

class Animal1 {

    Animal1() throws FileNotFoundException, IndexOutOfBoundsException {
    }
}

class Mouse1 extends Animal1 {

    Mouse1() throws IOException, IOException, ArrayIndexOutOfBoundsException {
        super();
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Некорректный возраст");
        }
        this.name = name;
        this.age = age;
    }
}