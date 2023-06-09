package JavaForBeginners.Lessons.Lesson_28;

public class Test6 {
    static String abc() {
        String s1 = "";
        String s2 = null;
        try {
            try {
                s1 += "1";
                s2.charAt(3);
                s1 += "2";
            } catch (NullPointerException e) {
                s1 += "3";
                throw new RuntimeException();
            } finally {
                s1 += "4";
                throw new Exception();
            }
        } catch (Exception e) {
            s1 += "5";
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}