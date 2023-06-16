import java.io.Serial;
import java.io.Serializable;

public class Bill implements Serializable {
    @Serial
    private static final long serialVersionUID = 2398472479L;
    private Long id;
    private Integer amount;
    private Boolean isOverdraftEnabled;

    public Bill() {

    }

    public Bill(Long id, Integer amount, Boolean isOverdraftEnabled) {
        this.id = id;
        this.amount = amount;
        this.isOverdraftEnabled = isOverdraftEnabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getOverdraftEnabled() {
        return isOverdraftEnabled;
    }

    public void setOverdraftEnabled(Boolean overdraftEnabled) {
        isOverdraftEnabled = overdraftEnabled;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", amount=" + amount +
                ", isOverdraftEnabled=" + isOverdraftEnabled +
                '}';
    }
}