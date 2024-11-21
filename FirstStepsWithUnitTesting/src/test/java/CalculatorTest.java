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
    public void twoPlusNegativeFiveShouldBeNegativeThree() {
        int result = calculator.add(2, -5);
        assertEquals(-3, result);
    }

    @Test
    public void twoPlusZeroShouldBeTwo() {
        int result = calculator.add(2, 0);
        assertEquals(2, result);
    }

    @Test
    public void negativeTwoPlusNegativeSevenShouldBeNegativeNine() {
        int result = calculator.add(-2, -7);
        assertEquals(-9, result);
    }

    @Test
    public void addingLargeNumbersShouldBeCorrect() {
        int result = calculator.add(2456, 2544);
        assertEquals(5000, result);
    }

    @Test
    public void tenMinusFiveShouldBeFive() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void negativeTenMinusNegativeFiveShouldBeNegativeFive() {
        int result = calculator.subtract(-10, -5);
        assertEquals(-5, result);
    }

    @Test
    public void negativeTenMinusFiveShouldBeNegativeFifteen() {
        int result = calculator.subtract(-10, 5);
        assertEquals(-15, result);
    }

    @Test
    public void TenMinusZeroShouldBeTen() {
        int result = calculator.subtract(10, 0);
        assertEquals(10, result);
    }

}