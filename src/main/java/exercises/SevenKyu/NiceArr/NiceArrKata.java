package exercises.SevenKyu.NiceArr;

import java.util.Arrays;
import java.util.List;

public class NiceArrKata {
    public static void main(String[] args) {
        System.out.println(isNice(new Integer[]{1, 2, 3}));
    }


    public static boolean isNice(final Integer[] arr) {

        if (arr.length < 2) return false;


        for (int i = 0 ; i < arr.length ; i++) {

            int first = (arr[i] - 1);
            int second = (arr[i] + 1);

            if (Arrays.stream(arr).noneMatch(integer -> integer == first) && Arrays.stream(arr).noneMatch(integer -> integer == second)) {
                return false;
            }


        }
        return true;
    }
}
