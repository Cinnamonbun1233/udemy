package JavaForBeginners.Homeworks.Homework_9;

public class Test3 {

    static int b = 2;
    int a = 1;

    public static void main(String[] args) {

        Test3 t = new Test3();
        t.abc(4);
    }

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
}