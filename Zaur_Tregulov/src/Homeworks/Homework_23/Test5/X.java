package Homeworks.Homework_23.Test5;

public class X {
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}

class Test {
    public static void main(String[] args) {
        X x = new Y();
        //System.out.println(x.s1 + " " + x.bool);
    }
}