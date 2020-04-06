package exercises.SixKyu.HighestScore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestScoreKata {
    public static void main(String[] args) {
        String s = high("man i need a taxi up to ubud");
        System.out.println(s);
    }

    public static String high(String s) {
        List<char[]> stringList = Arrays.stream(s.split(" "))
                .map(s1 -> s1.toCharArray())
                .collect(Collectors.toList());

        int x = 0;
        int y = 0;

        for (int i = 0 ; i < stringList.size() ; i++) {

            if (x < sum(stringList.get(i))) {
                x = sum(stringList.get(i));
                y = i;
            }
        }

        return String.valueOf(stringList.get(y));
    }

    public static int sum(char[] arr) {
        int n = 0;

        for (int i = 0 ; i < arr.length ; i++) {
            n += arr[i] - 96;
        }

        return n;
    }
}
