package JavaForBeginners.Lessons.Lesson_21;

public class Test2 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("privet");
        s2 = new String("poka");
        s1 = s2;
        String s3 = s1;
        s1 = null;
    }
}