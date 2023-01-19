package Lessons.Lesson_16;

public class Test4 {

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Uraaaaaa";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa", " Ураааааа!").substring(0,5);
        System.out.println(s1.substring(s1.indexOf('W')));
        System.out.println(s3);
    }
}