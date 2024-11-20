import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void twoPlusTwoShouldBeFour() {
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void twoPlusFiveShouldBeSeven() {
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void twoPlusMinusFiveShouldBeMinusThree() {
        int result = calculator.add(2, -5);
        assertEquals(-3, result);
    }

    @Test
    public void twoPlusZeroShouldBeTwo() {
        int result = calculator.add(2, 0);
        assertEquals(2, result);
    }

}