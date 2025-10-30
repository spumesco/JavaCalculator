import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    @Test
    void mod() {
        ScientificCalculator ScientificCalc = new ScientificCalculator();
        ScientificCalc.setNumbers(100, 9);
        assertEquals(1, ScientificCalc.mod());
    }
}