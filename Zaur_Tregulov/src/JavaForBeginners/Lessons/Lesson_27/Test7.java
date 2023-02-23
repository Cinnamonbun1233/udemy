package JavaForBeginners.Lessons.Lesson_27;

public class Test7 {
    static void abc() {
        System.out.println("Работает метод abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        }catch (StackOverflowError e){
            System.out.println("Error пойман");
        }
    }
}