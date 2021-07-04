package guru.springframework.moneyProblem;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

}
