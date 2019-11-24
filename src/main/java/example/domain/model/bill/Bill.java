package example.domain.model.bill;

import example.domain.model.attempt.Attempt;

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
