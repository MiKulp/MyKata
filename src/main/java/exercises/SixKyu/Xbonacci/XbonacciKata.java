package exercises.SixKyu.Xbonacci;

import java.util.Arrays;

public class XbonacciKata {

    public static void main(String[] args) {

    }

    public static double[] xbonacci(final double[] signature, final int n) {
        double[] returnArray = new double[n];

        if (n < signature.length) {

            for (int i = 0 ; i < n  ; i++) {
                returnArray[i] = signature[i];
            }
            return returnArray;
        }

        for (int i = 0 ; i < signature.length ; i++) {
            returnArray[i] = signature[i];
        }

        for (int i = signature.length ; i < n ; i++) {
            double k = 0;
            for (int j = i - signature.length ; j < i ; j++) {
                k += returnArray[j];
            }
            returnArray[i] = k;
        }

        return returnArray;
    }
}
