package exercises.SevenKyu.SortBoysKata;


import java.util.Arrays;
import java.util.Comparator;

public class SortOutKata {


    public static int[] menFromBoys(final int[] values) {

        int[] enterEvenArrayNewType = Arrays.stream(values)
                .boxed()
                .filter(v -> v % 2 == 0)
                .distinct()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        int[] enterOddArrayNewType = Arrays.stream(values)
                .boxed()
                .filter(v -> v % 2 != 0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int[] returnArr = new int[enterEvenArrayNewType.length + enterOddArrayNewType.length];

        System.arraycopy(enterEvenArrayNewType, 0, returnArr, 0, enterEvenArrayNewType.length);
        System.arraycopy(enterOddArrayNewType, 0, returnArr, enterEvenArrayNewType.length, enterOddArrayNewType.length);

        return returnArr;
    }
}
