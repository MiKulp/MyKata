package exercises.SixKyu.SumOfTwoIntegers;

public class SumOfIntegersKata {

    public static int add(int x, int y) {

        if (y != 0) {

            int c = x & y;
            x = x ^ y;
            y = c << 1;

        }

        return x;
    }


}
