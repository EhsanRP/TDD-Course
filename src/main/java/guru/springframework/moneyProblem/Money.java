package guru.springframework.moneyProblem;

public class Money {

    /*
        This section belongs to class properties.
        I Made this comment section only and only because it might get complicated so this indicator shows where the properties section begin.
    */

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /*
        This section belongs to factory methods to instantiate currencies such as Franc and Dollar
        @Param amount: indicates amount of the instance
     */

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    /*
        Currency Utils here
     */

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    protected String currency() {
        return currency;
    }

    /*
        Class methods: Equals, HashCode and ToString
     */

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null) return false;

        Money money = (Money) object;
        return amount == money.amount && this.currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

}
