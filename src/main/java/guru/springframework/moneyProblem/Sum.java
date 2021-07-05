package guru.springframework.moneyProblem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Sum implements Expression {

    Expression augmend;
    Expression addmend;

    @Override
    public Money reduce(Bank bank, String toCurrency) {

        var from = augmend.reduce(bank, toCurrency).amount;
        var to = addmend.reduce(bank, toCurrency).amount;

        var amount = from + to;

        return new Money(amount, toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addmend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augmend.times(multiplier), addmend.times(multiplier));
    }
}
