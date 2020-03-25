package exercises.SixKyu.ConsecutiveStrings;

import java.util.Arrays;

public class ConsecutiveStringsKata {

    public static void main(String[] args) {
      String s = longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2);

    }

    public static String longestConsec(String[] strarr, int k) {
        String returnString = "";

        if (strarr.length == 0)
            return "";

        if (k <= 0)
            return "";

        if (k > strarr.length)
            return "";

        Integer[] aux = auxillaryArray(strarr, k);

        Integer max = Arrays.stream(aux).max(Integer::compare).get();
        int index = Arrays.asList(aux).indexOf(max);

        for (int i = index ; i < index+k  ; i++) {

            returnString = returnString + strarr[i];

        }

        return returnString;
    }

    public static Integer[] auxillaryArray(String[] strarr, int k) {
        Integer[] intarr = new Integer[(strarr.length - k) + 1];

        for (int i = 0 ; i < (strarr.length - k) + 1 ; i++) {
            int j = i;
            int n = 0;
            int sum = 0;

            while (n < k) {
                sum += strarr[j].length();
                n++;
                j++;
            }

            intarr[i] = sum;
        }
        return intarr;
    }
}




