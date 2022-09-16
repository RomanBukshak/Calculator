public class Calculator {

    public static Integer result;
    public static Integer sum (Integer value1, Integer value2) {
        result = value1 + value2;
        return result;
    }

    public static Integer difference (Integer value1, Integer value2) {
        result = value1 - value2;
        return result;
    }

    public static Integer multiplication (Integer value1, Integer value2) {
        result = value1 * value2;
        return result;
    }

    public static Integer division (Integer value1, Integer value2) {
        result = value1 / value2;
        return result;
    }

    public static void clear (){
        result = 0;
    }




}
