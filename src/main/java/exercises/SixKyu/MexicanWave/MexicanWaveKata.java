package exercises.SixKyu.MexicanWave;

import java.util.Arrays;
import java.util.Objects;

public class MexicanWaveKata {

    public static void main(String[] args) {
        String str = "two words";
        String[] arrStr = wave(str);

        for (String s : arrStr) {
            System.out.println(s);
        }
    }

    public static String[] wave(String str) {

        char[] arr = str.toCharArray();
        String[] returnArray = new String[str.length()];

        for (int i = 0 ; i < str.length() ; i++) {

            StringBuilder value = new StringBuilder("");

            for (int j = 0 ; j < str.length() ; j++) {

                if (i == j) {
                    value.append(String.valueOf(arr[i]).toUpperCase());

                } else
                    value.append(arr[j]);

            }

            if (!String.valueOf(arr[i]).equals(" "))
                returnArray[i] = value.toString();
        }

        return Arrays.stream(returnArray).filter(Objects::nonNull).toArray(String[]::new);
    }
}
