package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
public class Dollar {

    private int amount;

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
