package exercises.SevenKyu.PalindromeChainLength;

import java.math.BigInteger;

public class PalindromeKata {

    public static int palindromeChainLength (long n) {

       return palindromeChainLength(0,n);

    }



    private static int palindromeChainLength(int counter, long n) {

        StringBuilder builder = new StringBuilder(String.valueOf(n));
        String enterValue = String.valueOf(n);
        String reversedValue = builder.reverse().toString();
        long numberToReturn;
        BigInteger insertBig = new BigInteger(enterValue);
        BigInteger insertBigRev = new BigInteger(reversedValue);

        if(insertBig.add(insertBigRev).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return counter;
        }

        if (enterValue.equals(reversedValue)) {
            return counter;
        }
        else {
            numberToReturn = Long.parseLong(enterValue) + Long.parseLong(reversedValue);
            return palindromeChainLength(++counter, numberToReturn);
        }
    }


}
