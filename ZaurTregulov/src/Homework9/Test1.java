package Homework9;

public class Test1 {

    static int a = 2;
    int b = 1;

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }
}
