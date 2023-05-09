package java_start.part_001.lesson_008.constructor;

public class SayCatService {
    public static String hello = "Hello from static";

    public static void sayMeow() {
        System.out.println("Meow");
    }

    public void say(Cat cat, String message) {
        String catName = cat.getName();
        System.out.println(concatNameAndMessage(catName, message));
    }

    private String concatNameAndMessage(String name, String message) {
        return name + ": " + message;
    }
}