package lesson_007.bankSystem.entity;

public class Account {
    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill) {
        this.person = person;
        this.bill = bill;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}