package JavaForBeginners.Lessons.Lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        try {
            File f = new File("/Users/dima/IdeaProjects/udemy/Zaur_Tregulov/test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (NullPointerException e) {
            System.out.println("Пойман Exception 1");
        } catch (FileNotFoundException e) {
            System.out.println("Пойман Exception 2");
        } catch (RuntimeException e) {
            System.out.println("Пойман Exception 4");
        } catch (Exception e) {
            System.out.println("Пойман Exception 5");
        } catch (Throwable e) {
            System.out.println("Пойман Exception 6");
        } finally {
            System.out.println("Конец программы");
        }
    }
}