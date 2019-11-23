package example.domain.model;

/**
 * 料金計算書
 */
public class Bill {
    Attempt attempt;
    Amount amount;

    public Bill(Attempt attempt, Amount amount) {
        this.attempt = attempt;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", attempt, amount);
    }
}
