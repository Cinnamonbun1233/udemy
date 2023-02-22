package Lessons.Lesson_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Привет");
        try {
            File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            System.out.println("Переменная 'a' в catch блоке = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Это блок finally");
            System.out.println("Переменная 'a' в finally блоке = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
