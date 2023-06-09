package lesson_013;

import lesson_013.entity.Cat;
import lesson_013.entity.Owner;

public class CatMain {
    public static void main(String[] args) {
        Owner alex = new Owner("Alex");
        final Cat lori = new Cat("Lori", 4, alex);
        System.out.println(lori);
    }
}