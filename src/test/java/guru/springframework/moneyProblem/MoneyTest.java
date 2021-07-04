package guru.springframework.moneyProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    /*
    Testing Implementations of money Problem including Multiplication and Equality
    Note that: The only way to have Dollar and Franc currencies is by using Money Factory methods.
     */

    @Test
    void testMultiplication() {

        var fiveUSD = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveUSD.times(2));

        var fiveCHF = Money.franc(5);
        assertEquals(Money.franc(10), fiveCHF.times(2));
    }

    @Test
    void testEquality() {

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(10));

        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(10));

        assertNotEquals(Money.dollar(5),Money.franc(5));
    }

    /*
    Testing Currencies Francs and Dollars + Testing currency utilities
    Note that: The only way to have Dollar and Franc currencies is by using Money Factory methods.
     */

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void testSimpleAddition() {
        var five = Money.dollar(5);
        Expression sum = five.plus(five);
        var bank = new Bank();
        var reduced = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10),reduced);
    }
}
