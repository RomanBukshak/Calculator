public class Calculator {

    private static long result;

    public static long sum (long value1, long value2) {
        result = value1 + value2;
        return result;
    }

    public static long difference (long value1, long value2) {
        result = value1 - value2;
        return result;
    }

    public static long multiplication (long value1, long value2) {
        result = value1 * value2;
        return result;
    }

    public static long division (long value1, long value2) {
        result = value1 / value2;
        return result;
    }

    public static void clear (){
        result = 0;
    }




}
