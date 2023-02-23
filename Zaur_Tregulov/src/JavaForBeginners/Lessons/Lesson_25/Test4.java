package JavaForBeginners.Lessons.Lesson_25;

public class Test4 {
    public static void main(String[] args) {
        String[] array1 = {"privet", "poka"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
//      array3[0]=new StringBuilder();
        array2[0] = new StringBuilder();
    }
}