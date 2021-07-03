package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Dollar {

    private int amount;

    void times(int value){
        amount *= value;
    }

}
