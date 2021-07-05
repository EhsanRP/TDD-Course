package guru.springframework.moneyProblem;

public interface Expression {
    Money reduce(Bank bank, String toCurrency);
}
