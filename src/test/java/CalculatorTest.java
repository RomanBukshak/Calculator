import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class CalculatorTest {


    @BeforeEach
    void clear(){
        Calculator.clear();
    }

    @Test
    void testSum() {
        Assertions.assertEquals(BigInteger.valueOf(22),Calculator.sum(BigInteger.valueOf(11),BigInteger.valueOf(11)));
    }

    @Test
    void testDifference() {
        Assertions.assertEquals(BigInteger.valueOf(4), Calculator.difference(BigInteger.valueOf(6),BigInteger.valueOf(2)));
    }

    @Test
    void testMultiplication() {
        Assertions.assertEquals(BigInteger.valueOf(20),Calculator.multiplication(BigInteger.valueOf(4),BigInteger.valueOf(5)));
    }

    @Test
    void testDivision() {
        Assertions.assertEquals(BigInteger.valueOf(5), Calculator.division(BigInteger.valueOf(20),BigInteger.valueOf(4)));
    }
}