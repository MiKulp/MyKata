package exercises.SixKyu.TransformToPrime;

import java.util.stream.IntStream;

public class TransformKata {


    public static int minimumNumber(int[] numbers) {

        int maxPrime = 0;
        int auxSum = IntStream.of(numbers).sum();

        while (maxPrime == 0) {

            if (isPrime(auxSum)) maxPrime = auxSum;
            auxSum++;
        }

        return maxPrime - IntStream.of(numbers).sum();
    }

    private static boolean isPrime(int n) {

        double div = Math.sqrt(n);

        for (int i = 2 ; i <= div ; i++) {

            if (n % i == 0) return false;
        }

        return true;
    }
}
