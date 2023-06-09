package JavaForBeginners.Lessons.Lesson_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test.txt");
            System.out.println("Файл test существует в системе и найден");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Проблемы со стримом fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test не найден");
        } catch (NullPointerException e) {
            System.out.println("Сработал NullPointerException");
        }
    }
}