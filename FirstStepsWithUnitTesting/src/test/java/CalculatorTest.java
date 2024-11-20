import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    @Test
    public void twoPlusTwoShouldBeFour() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void twoPlusFiveShouldBeSeven() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void twoPlusMinusFiveShouldBeMinusThree() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, -5);
        assertEquals(-3, result);
    }

    @Test
    public void twoPlusZeroShouldBeTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 0);
        assertEquals(2, result);
    }

}