package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;
}

class BankPerson {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();

        bankAccount1.id = 1;
        bankAccount1.name = "Zaur";
        bankAccount1.balance = 12.35;

        bankAccount2.id = 2;
        bankAccount2.name = "Mike";
        bankAccount2.balance = 2.00;

        bankAccount3.id = 3;
        bankAccount3.name = "Ivan";
        bankAccount3.balance = 100.25;
    }
}