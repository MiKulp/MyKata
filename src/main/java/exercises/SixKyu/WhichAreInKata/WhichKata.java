package exercises.SixKyu.WhichAreInKata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WhichKata {

    public static void main(String[] args) {

        String a[] = new String[]{"arp", "live", "strong"};
        String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};

        inArray(a, b);
    }

    public static String[] inArray(String[] array1, String[] array2) {

        String returnString = "";

        for (int i = 0 ; i < array2.length ; i++) {

            for (int j = 0 ; j < array1.length ; j++) {
                if (array2[i].contains(array1[j])) returnString = returnString.concat(array1[j] + " ");
            }
        }

        if (returnString.length() == 0) return new String[]{};

        return Arrays.stream(returnString.split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "))
                .split(" ");
    }

}
