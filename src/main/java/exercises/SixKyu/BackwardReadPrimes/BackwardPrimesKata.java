package exercises.SixKyu.BackwardReadPrimes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackwardPrimesKata {

    public static void main(String[] args) {
//        System.out.println (isPrimeNumber(113));

        System.out.println(backwardsPrime(1, 100));

//        System.out.println(reverseLong(1234, 0));
    }

    public static String backwardsPrime(long start, long end) {
        List<Long> returnList = new ArrayList<>();

        for (long i = start ; i < end ; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(reverseLong(i, 0)) && i != reverseLong(i, 0)) {
                returnList.add(i);
            }
        }
        return returnList.stream().map(aLong -> String.valueOf(aLong)).collect(Collectors.joining(" "));
    }

    public static boolean isPrimeNumber(long n) {
        boolean b = true;

        if ((n & 1) != 1) return false;
        double in = Math.sqrt(n);

        for (int i = 3 ; i < in ; ) {
            if (n % i != 0) i = i + 2;
            if (n % i == 0) return false;
        }

        return b;
    }

    public static long reverseLong(long l, long m) {
        long n;

        if (l == 0) return m;

        else {
            n = (m * 10) + (l % 10);
            return reverseLong(l / 10, n);
        }

    }
}
