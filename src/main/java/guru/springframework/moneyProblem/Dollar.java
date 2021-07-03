package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Dollar {

    private int amount;

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

}
