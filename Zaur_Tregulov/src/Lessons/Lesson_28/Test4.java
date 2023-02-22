package Lessons.Lesson_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test.txt");
            try {
                fis2 = new FileInputStream("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test1.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Файл test1 не найден");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test не найден");
        } finally {
            System.out.println("Это внешний finally блок");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найдено исключение в finally блоке");
            }
        }
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc();
    }
}