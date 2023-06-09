package JavaForBeginners.Homeworks.Homework_25;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Swordfish("Karl_1");
        Animal a2 = new Penguin("Kowalski_1");
        Animal a3 = new Lion("Leva_1");
        Fish f1 = new Swordfish("Karl_2");
        Bird b1 = new Penguin("Kowalski_2");
        Mammal m1 = new Lion("Leva_2");
        Swordfish sw1 = new Swordfish("Karl_3");
        Penguin pg1 = new Penguin("Kowalski_3");
        Lion l1 = new Lion("Leva_3");
        Speakable s1 = new Penguin("Kowalski_4");
        Speakable s2 = new Lion("Leva_4");
        Animal[] array1 = {a1, a1, a3, f1, b1, m1, sw1, pg1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, pg1, l1};

        for (Animal a : array1) {
            if (a instanceof Swordfish) {
                Swordfish s = (Swordfish) a;
                System.out.println(s.name);
                s.sleep();
                s.eat();
                s.swim();
            } else if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
                System.out.println(p.name);
                p.sleep();
                p.eat();
                p.fly();
                p.speak();
            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.sleep();
                l.eat();
                l.run();
                l.speak();
            }
        }
        System.out.println("-------------------------------------");

        for (Speakable s : array2) {
            if (s instanceof Penguin) {
                Penguin p = (Penguin) s;
                System.out.println(p.name);
                p.sleep();
                p.eat();
                p.fly();
                p.speak();
            } else if (s instanceof Lion) {
                Lion l = (Lion) s;
                System.out.println(l.name);
                l.sleep();
                l.eat();
                l.run();
                l.speak();
            }
        }
    }
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как кушают рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " поет!");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Кто-то говорит");
    }
}

class Swordfish extends Fish {
    public Swordfish(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба и она ест обычный рыбий корм");
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }
}

class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи");
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прислонившись друг к другу");
    }
}

class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }

    @Override
    void eat() {
        System.out.println("Лев как любой хищник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }
}
