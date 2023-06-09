package JavaForBeginners.Lessons.Lesson_26;

public class Test5 {

    {
        System.out.println("Это init-блок 3");
    }

    Test5() {
        System.out.println("Это конструктор 1");
    }

    Test5(int a) {
        this();
        System.out.println("Это конструктор 2");
    }

    String s1;

    static {
//        s1 = "ok";
//        System.out.println("Hello");
//        int a = 5;
//        System.out.println(a);
        System.out.println("Это static-блок 1");
    }

    {
        System.out.println("Это init-блок 2");
    }

    static {
        System.out.println("Это static-блок 4");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);
    }
}