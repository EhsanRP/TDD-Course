package guru.springframework.moneyProblem;

public class Bank {
    Money reduce(Expression source,String toCurrency){
        return source.reduce(toCurrency);
    }
}