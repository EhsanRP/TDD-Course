package guru.springframework.moneyProblem;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
