package example.domain.model.spacification;

import java.time.LocalDate;

/**
 * 出発日
 */
public class DepartureDate {
    LocalDate value;

    public DepartureDate(String textValue) {
        this.value = LocalDate.parse(textValue);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
