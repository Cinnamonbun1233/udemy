package JavaForBeginners.Homeworks.Homework_17;

public class Main {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Privet");
        StringBuilder sb3 = new StringBuilder("Poka");
        boolean b = ravenstvo(sb1, sb2);
        boolean b2 = ravenstvo(sb1,sb3);
        System.out.println(b);
        System.out.println(b2);
    }
}