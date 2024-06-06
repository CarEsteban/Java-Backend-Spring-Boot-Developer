
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciCalculatorTest {
    FibonacciCalculator calculator = new FibonacciCalculator();
    int valor;
    @Test
    void testNumeroCero() {
        valor = 0;
        assertEquals(0, calculator.calculate(0));
    }
    @Test
    void testNumeroUno() {
        valor = 1;
        assertEquals(1, calculator.calculate(1));
    }
    @Test
    void testNumeroMayorAUno() {
        valor = 10;
        assertEquals(55, calculator.calculate(10));
    }
}
