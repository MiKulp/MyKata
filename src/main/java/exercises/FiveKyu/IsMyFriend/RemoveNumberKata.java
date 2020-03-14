package exercises.FiveKyu.IsMyFriend;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumberKata {
    public static void main(String[] args) {
        removNb(26);
    }

    public static List<long[]> removNb(long n) {
        long sumOfAllSequenceNumbers = (n * (n + 1)) / 2;
        List<long[]> resultList = new ArrayList<>();


        for (long b = 0 ; b < n ; b++) {
            double a = ((double) sumOfAllSequenceNumbers - (double) b) / ((double)b + 1);

            if (a < n && a == (int) a) {
                long[] arr = new long[]{b, (long) a};
                resultList.add(arr);
            }
        }
        return resultList;
    }
}
