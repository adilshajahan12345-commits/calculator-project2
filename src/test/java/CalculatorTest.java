import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(9, calculator.add(4, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testMain() {
        assertDoesNotThrow(() -> Calculator.main(new String[]{}));
    }
}
