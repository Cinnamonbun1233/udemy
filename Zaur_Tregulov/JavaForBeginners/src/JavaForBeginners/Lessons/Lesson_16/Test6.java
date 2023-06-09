package JavaForBeginners.Lessons.Lesson_16;

public class Test6 {

    public static void main(String[] args) {

        String s1 = new String("ok");
        String s2 = new String("ok");
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s1);

        String s4 = "privet";
        String s5 = "privet";
        String s6 = "PrIvEt";

        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5)); //сравнивает
        System.out.println(s1!=s4);
        System.out.println(s5.equalsIgnoreCase(s6)); //сравнивает без учета регистра
    }
}