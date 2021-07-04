package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Sum implements Expression{
    Money augmend;
    Money addmend;

    public Money reduce(String toCurrency){
        var amount = augmend.amount+addmend.amount;
        return new Money(amount,toCurrency);
    }
}
