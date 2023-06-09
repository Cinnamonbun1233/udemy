package JavaForBeginners.Lessons.Lesson_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {

    void abc() throws FileNotFoundException {
        try {
            File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман и немного обработан");
            throw e;
        } finally {
            System.out.println("Это блок finally");
        }
    }

    void def() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception пойман и немного обработан");
            throw e;
        } finally {
            System.out.println("Это блок finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман и обработан");
        }
    }
}