import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @BeforeEach
    public void clear(){
        Calculator.clear();
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(22,Calculator.sum(11,11), "Calculator.sum(11,11) fail!");
    }

    @Test
    public void testDifference() {
        Assertions.assertEquals(4, Calculator.difference(6,2), "Calculator.difference(6,2) fail!");
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(20,Calculator.multiplication(4,5), "Calculator.multiplication(4,5) fail!");
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(5, Calculator.division(20,4), "Calculator.division(20,4) fail!");
    }

}