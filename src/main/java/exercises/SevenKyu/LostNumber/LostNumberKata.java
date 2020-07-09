package exercises.SevenKyu.LostNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class LostNumberKata {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        HashSet<Integer> smallerSet = Arrays.stream(mixedArr)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        HashSet<Integer> biggerrSet = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));


        biggerrSet.removeAll(smallerSet);
        int n = 0;

        for (Integer integer : biggerrSet) {
            n = integer;
        }


        return n;
    }
}
