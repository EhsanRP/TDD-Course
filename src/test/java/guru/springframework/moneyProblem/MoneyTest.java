package guru.springframework.moneyProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    /*
    Testing Dollar Implementations of money Problem including Multiplication and Equality
    Note that: Dollar constructor @Param is only money amount
     */

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(10));
    }

    /*
    Testing Franc Implementations of money Problem including Multiplication and Equality
    Note that: Franc constructor @Param is only money amount
     */

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals( Money.franc(5), Money.franc(5));
        assertNotEquals( Money.franc(5), Money.franc(10));
    }

     /*
    Testing equality methods to compare Francs and Dollars
    Note that: Money and subclasses constructor @Param is only money amount
     */

    @Test
    void testDollarFrancEquality() {
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }
}
