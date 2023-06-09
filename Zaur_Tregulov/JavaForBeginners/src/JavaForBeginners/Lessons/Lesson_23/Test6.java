package JavaForBeginners.Lessons.Lesson_23;

public class Test6 {
    String s1 = "Privet";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class Test6_1 extends Test6 {
    String s1 = super.s1 + ", drug";

    int summa(int... i) {
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        return result;
    }

    public static void main(String[] args) {
        Test6_1 test61 = new Test6_1();
        System.out.println(test61.s1);
    }
}