package java_start.module_001.lesson_013.immutables;

public class CatMain {
    public static void main(String[] args) {
        Owner alex = new Owner("Alex");
        final Cat lori = new Cat("Lori", 4, alex);
    }
}