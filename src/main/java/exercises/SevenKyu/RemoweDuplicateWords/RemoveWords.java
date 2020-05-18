package exercises.SevenKyu.RemoweDuplicateWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWords {

    public static String removeDuplicateWords(String s) {

        if (s == null) return "";

        return Arrays.stream(s.split(" ")).distinct()
                .collect(Collectors.joining(" "));
    }
}
