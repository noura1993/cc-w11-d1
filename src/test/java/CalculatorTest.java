import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    public void subtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }


}
