package JavaForBeginners.Lessons.Lesson_20;

import java.util.ArrayList;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            //it.next();
            //it.remove();
            System.out.println(it.next());
        }
    }
}
