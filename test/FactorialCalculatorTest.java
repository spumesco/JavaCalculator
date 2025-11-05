import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void factorial() {
        FactorialCalculator fc = new FactorialCalculator();
        fc.setNumbers(6,3);
        assertEquals(72, fc.factorial());
    }
}