package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Franc {
    private int amount;

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
