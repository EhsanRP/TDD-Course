package guru.springframework.moneyProblem;

import java.util.Objects;

public class Money implements Expression {

    /**
        This section belongs to class properties.
        I Made this comment section only and only because it might get complicated so this indicator shows where the properties section begin.
    **/

    protected final int amount;
    protected final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
        This section belongs to factory methods to instantiate currencies such as Franc and Dollar
        @Param amount: indicates amount of the instance
     **/

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    /**
        Currency Utils here
     **/

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    protected String currency() {
        return currency;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        var rate = bank.rate(this.currency, toCurrency);
        return new Money(amount / rate, toCurrency);
    }

    /**
        Class methods: Equals, HashCode and ToString
     **/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount == money.amount && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

}
