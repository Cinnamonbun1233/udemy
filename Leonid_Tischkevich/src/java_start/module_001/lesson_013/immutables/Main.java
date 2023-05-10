package java_start.module_001.lesson_013.immutables;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        String b = a.concat("DEF");
        System.out.println(a);
        System.out.println(b);
        System.out.println("\n");

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF").append("JKL");
        System.out.println(stringBuilder);
        a = stringBuilder.toString();
        System.out.println(a);
        System.out.println("\n");

        String t = "ABC";
        System.out.println(t.concat("DEF").concat("JKL"));
        System.out.println("\n");

        StringBuffer stringBuffer = new StringBuffer("ABC");
        stringBuffer.append("DEG").append("JKL");
        System.out.println(stringBuffer);
    }
}