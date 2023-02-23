package JavaForBeginners.Lessons.Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
    void abc() {
        File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test1.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Всем хорошего дня");
        } catch (FileNotFoundException e) {
            System.out.println("Был пойман Exception: " + e);
        }
    }

    void def() {
        System.out.println("Привет");
        abc();
    }

    void ghi() {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) throws FileNotFoundException {
        Test5 t = new Test5();
        t.def();
    }
}