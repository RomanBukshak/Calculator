import org.jetbrains.annotations.NotNull;
import java.math.BigInteger;

public class Calculator {

    public static BigInteger result;
    public static BigInteger sum (BigInteger value1, BigInteger value2) {
        result = value1.add(value2);
        return result;
    }

    public static BigInteger difference (BigInteger value1, BigInteger value2) {
        result = value1.subtract(value2);
        return result;
    }

    public static BigInteger multiplication (BigInteger value1, BigInteger value2) {
        result = value1.multiply(value2);
        return result;
    }

    public static BigInteger division (BigInteger value1, @NotNull BigInteger value2) {
        result = value1.divide(value2);
        return result;
    }

    public static void clear (){
        result = BigInteger.ZERO;
    }




}
