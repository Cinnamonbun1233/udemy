package Lessons.Lesson_26;

public class Test7 {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("----------");
        Lion lion = new Lion();
    }
}

class Animal {
    Animal() {
        System.out.println("Конструктор Animal");
    }

    static {
        System.out.println("static init is Animal");
    }

    {
        System.out.println("Non-static init is Animal");
    }
}

class Mammal extends Animal{
    Mammal() {
        System.out.println("Конструктор Mammal");
    }

    static {
        System.out.println("static init is Mammal");
    }

    {
        System.out.println("Non-static init is Mammal");
    }
}

class Lion extends Mammal{
    Lion() {
        System.out.println("Конструктор Lion");
    }

    static {
        System.out.println("static init is Lion");
    }

    {
        System.out.println("Non-static init is Lion");
    }
}