package JavaForBeginners.Lessons.Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test.txt");
            System.out.println("Объект файл создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Стрим создался");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Это finally");
            System.out.println(result);
        }
    }
}