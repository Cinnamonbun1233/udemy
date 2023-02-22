package Lessons.Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test.txt");

//        int[] array = {4, 8, 1};
//        System.out.println("У нас есть массив");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println(fis.read());
//            System.out.println(array[1]);
            System.out.println("Всем хорошего дня");
        } catch (NullPointerException | IOException e) {
            System.out.println("Был пойман Exception: " + e);
        } finally {
            System.out.println("Этот блок всегда обрабатывается");
        }
        System.out.println("Данный код не имеет отношения к исключениям");
    }
}