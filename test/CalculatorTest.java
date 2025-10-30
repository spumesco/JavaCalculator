import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        Calculator addCalc = new Calculator();
        addCalc.setNumbers(10, 20);
        assertEquals(30, addCalc.add());
    }

    @Test
    void subtract() {
        Calculator subtractCalc = new Calculator();
        subtractCalc.setNumbers(10, 20);
        assertEquals(-10, subtractCalc.subtract());
    }

    @Test
    void multiply() {
        Calculator multiplyCalc = new Calculator();
        multiplyCalc.setNumbers(20, 10);
        assertEquals(200, multiplyCalc.multiply());
    }

    @Test
    void divide() {
        Calculator divideCalc = new Calculator();
        divideCalc.setNumbers(20, 10);
        assertEquals(2, divideCalc.divide());
    }
}