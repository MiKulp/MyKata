package exercises.SevenKyu.CountingPowerSets;

import java.math.BigInteger;

public class CountingKata {

    public static BigInteger powers(int[] list) {

        BigInteger bigInteger = BigInteger.valueOf(0);

        for (int i = 1 ; i <= list.length; i++) {
            bigInteger = bigInteger.add(factorial(list.length).divide(factorial(list.length-i).multiply(factorial(i))));
        }

        return bigInteger.add(BigInteger.valueOf(1));
    }

    private static BigInteger factorial(final int n) {

        if (n == 0) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
