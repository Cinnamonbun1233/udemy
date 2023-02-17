package Homeworks.Homework_24;

public class Main {
    public static void main(String[] args) {
        Swordfish swordfish = new Swordfish("Дори");
        System.out.println(swordfish.name);
        swordfish.swim();
        swordfish.sleep();
        swordfish.eat();
        System.out.println();

        Speakable penguin = new Penguin("Гюнтер");
        penguin.speak();
        System.out.println();

        Animal lion = new Lion("Симба");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();
        System.out.println();

        Mammal lion2 = new Lion("Димба");
        System.out.println(lion2.name);
        lion2.run();
        lion2.eat();
        lion2.speak();
        lion2.sleep();
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