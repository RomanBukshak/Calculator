import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @BeforeEach
    void clear(){
        Calculator.clear();
    }

    @Test
    void testSum() {
        Assertions.assertEquals((Integer)6,Calculator.sum(2,4));
    }

    @Test
    void testDifference() {
        Assertions.assertEquals((Integer)10, Calculator.difference(20,10));
    }

    @Test
    void testMultiplication() {
        Assertions.assertEquals((Integer)20,Calculator.multiplication(4,5));
    }

    @Test
    void testDivision() {
        Assertions.assertEquals((Integer)5, Calculator.division(20,4));
    }
}