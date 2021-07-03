package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Money money = (Money) object;
        return amount == money.amount;
    }

}
