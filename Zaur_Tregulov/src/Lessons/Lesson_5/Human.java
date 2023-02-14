package Lessons.Lesson_5;

public class Human {

    String name;
    HumanCar humanCar;
    HumanAccount humanAccount;

    void info() {
        System.out.println("Имя: " + name + ", цвет машины: " + humanCar.color + ", банковский счет: " + humanAccount.balance);
    }
}

class HumanCar {

    String color;
    String engine;

    HumanCar(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class HumanAccount {

    int id;
    double balance;

    HumanAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

class HumanTest {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "David";
        human.humanCar = new HumanCar("red", "V8");
        human.humanAccount = new HumanAccount(1234, 100.25);

        human.info();
    }
}