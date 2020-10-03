package exercises.SixKyu.LongestRepetition;

import java.util.Arrays;

public class RepetitionKata {


    public static Object[] longestRepetition(String s) {

        if (s.length() == 0) return new Object[]{"", 0};

        String stringValue = "";
        int intVlue = 0;

        String[] arr = s.split("(?<=(.))(?!\\1)");

        for (String str : arr) {
            if (str.length() > intVlue) {
                stringValue = String.valueOf(str.charAt(0));
                intVlue = str.length();
            }
        }

        return new Object[]{stringValue, intVlue};
    }
}
