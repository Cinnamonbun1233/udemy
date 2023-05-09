package java_start.part_001.lesson_007.bankSystem.entity;

public class Deposit {
    private Bill bill;

    public Deposit(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}