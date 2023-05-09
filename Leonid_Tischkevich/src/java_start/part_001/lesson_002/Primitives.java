package java_start.part_001.lesson_002;

public class Primitives {
    public static void main(String[] args) {
        long aLong = 50;
        int aInt = 29;
        byte aByte = 89;
        short aShort = 130;
        float aFloat = 180.98F;
        double aDouble = 348.98;

        int result1 = aByte + aShort;
        long result2 = aLong + aInt;
        double result3 = aFloat + aDouble;
        double result4 = aInt + aDouble;

        showResult(result1, result2, result3, result4);
        sumOfByteAndShort(aByte, aShort);
        sumOfIntAndLong(aInt, aLong);
        sumOfFloatAndDouble(aFloat, aDouble);
        sumOfIntAndDouble(aInt, aDouble);
    }

    private static void showResult(int result1, long result2, double result3, double result4) {
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static void sumOfByteAndShort(byte aByte, short aShort) {
        System.out.println(aByte + aShort);
    }

    public static void sumOfIntAndLong(int a, long b) {
        System.out.println(a + b);
    }

    public static void sumOfFloatAndDouble(float a, double b) {
        System.out.println(a + b);
    }

    public static void sumOfIntAndDouble(int a, double b) {
        System.out.println(a + b);
    }
}