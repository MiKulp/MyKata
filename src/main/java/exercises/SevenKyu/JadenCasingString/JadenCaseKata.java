package exercises.SevenKyu.JadenCasingString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCaseKata {

    public static void main(String[] args) {
        String s = null;

        String t = toJadenCase(s);
        System.out.println(t);


    }

    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase == "") {
            return null;
        }

        return Arrays.stream(phrase.split(" ")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length())).collect(Collectors.joining(" "));
    }
}
