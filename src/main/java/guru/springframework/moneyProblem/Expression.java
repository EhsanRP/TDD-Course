package guru.springframework.moneyProblem;

public interface Expression {
    Money reduce(String toCurrency);
}
