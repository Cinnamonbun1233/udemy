package Lessons.Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Файл найден");
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
