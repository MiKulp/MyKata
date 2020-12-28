package exercises.SevenKyu.MaxMinArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinKata {

    public static int[] solve(int[] arr) {

        Arrays.sort(arr);
        List<Integer> returnList = new ArrayList<>();

        for (int i = 0 ; i < arr.length / 2 ; i++) {
            returnList.add(arr[(arr.length - 1) - i]);
            returnList.add(arr[i]);
        }

        if (arr.length % 2 != 0) {
            returnList.add(arr[arr.length / 2]);
        }

        return returnList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
