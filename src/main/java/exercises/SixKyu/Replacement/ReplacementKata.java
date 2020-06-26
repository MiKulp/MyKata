package exercises.SixKyu.Replacement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplacementKata {

    public static int[] replacement(final int[] arr) {

        List<Integer> workList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int[] returnList = new int[arr.length];

        int i = Arrays.stream(arr).max().getAsInt();

        if (i == 1) workList.set(workList.indexOf(i), 2);
        else workList.set(workList.indexOf(i), 1);

        workList.sort(Integer::compareTo);

        for (int i1 = 0 ; i1 < workList.size() ; i1++) {
            returnList[i1] = workList.get(i1);
        }

        return returnList;
    }

}
