package example.domain.model;

/**
 * 金額
 */
public class Amount {
    int value;

    public Amount(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%,d円", value);
    }
}
