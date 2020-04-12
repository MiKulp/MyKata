package exercises.FiveKyu.PerimeterSquareRectangle;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static java.math.BigInteger.*;

public class PerimeterKata {

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }

    private static Map<BigInteger, BigInteger> inMemoryDB = new HashMap<>();

    public static BigInteger perimeter(BigInteger n) {

        return sumWithoutRec(n);
    }

    public static BigInteger perimRec(BigInteger n) {

        if (n.equals(valueOf(0))) return ZERO;

        if (n.equals(valueOf(1))) return ONE;

        if (inMemoryDB.containsKey(n)) {
            return inMemoryDB.get(n);
        }

        BigInteger v = (perimRec(n.subtract(ONE)).add(perimRec(n.subtract(TWO)))).add(ONE);
        inMemoryDB.put(n, v);
        return v;
    }

    public static BigInteger sumWithoutRec(BigInteger n) {
        int x = n.intValue();
        x++;

        if (x <= 1) return n;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger returnSet = BigInteger.valueOf(2);

        for (int i = 2 ; i < x  ; i++) {

            BigInteger temp = a;
            a = a.add(b);
            returnSet = returnSet.add(a);
            b = temp;
        }

        return returnSet.multiply(BigInteger.valueOf(4));
    }


}
