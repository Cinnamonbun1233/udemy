package Homeworks.Homework_5;

public class BankAccount {

    double balance;

    BankAccount() {
        balance = 100.0;
    }

    double balanceUp(double sum) {
        return balance += sum;
    }

    double balanceDown(double sum) {
        return balance -= sum;
    }
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.balance);
        bankAccount.balanceUp(150);
        bankAccount.balanceDown(100);
        System.out.println(bankAccount.balance);
    }
}
