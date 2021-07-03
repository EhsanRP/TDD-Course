package guru.springframework.moneyProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    /*
    Testing Dollar Implementations of money Problem including Multiplication and Equality
    Note that: Dollar constructor @Param is only money amount
     */

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10),product);
        product = five.times(3);
        assertEquals(new Dollar(15),product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(10));
    }

    /*
    Testing Franc Implementations of money Problem including Multiplication and Equality
    Note that: Franc constructor @Param is only money amount
     */

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10),product);
        product = five.times(3);
        assertEquals(new Franc(15),product);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(10));
    }

     /*
    Testing equality methods to compare Francs and Dollars
    Note that: Money and subclasses constructor @Param is only money amount
     */

    @Test
    void testDollarFrancEquality() {
        assertNotEquals(new Dollar(5), new Franc(5));
    }
}
