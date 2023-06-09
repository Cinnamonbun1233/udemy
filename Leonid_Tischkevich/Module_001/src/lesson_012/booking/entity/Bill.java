package lesson_012.booking.entity;

public class Bill {
    private Integer amount;

    public Bill(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}