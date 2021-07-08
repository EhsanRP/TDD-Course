package guru.springframework.moneyProblem;

import java.util.HashMap;

public class Bank {

    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, @SuppressWarnings("SameParameterValue") String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String to) {

        if (from.equals(to))
            return 1;

        var pair = new Pair(from,to);
        var rate = rateMap.get(pair);

        return rate;
    }

    public void addRate(String from, String to, int rate) {
        var pair = new Pair(from, to);
        rateMap.put(pair, rate);
    }
}
