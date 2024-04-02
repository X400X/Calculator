package fi.utu.smirnovkostiantyn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getResult());
    }

    @Test
    public void testReset() {
        Calculator calculator = new Calculator();
        calculator.add(3);
        assertEquals(3, calculator.getResult());
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(3);
        assertEquals(-3, calculator.getResult());
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.add(3);
        calculator.multiply(4);
        assertEquals(12, calculator.getResult());
    }

    @Test
    public void testExponent() {
        Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.exponent(3);
        assertEquals(8, calculator.getResult());
    }
}