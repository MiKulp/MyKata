package exercises.SixKyu.FormatStringIntoSentence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToSentenceKata {
    public static void main(String[] args) {

    }

    public static String formatWords(String[] words) {
        if (words == null) return "";

        List<String> stringList = Arrays.stream(words).filter(s -> !s.equals("")).collect(Collectors.toList());

        if ((words.length == 1 && words[0].equals("")) || words.length == 0 || stringList.size() == 0)
            return "";
        if (words.length == 1) return words[0];
        if (stringList.size() == 1) return stringList.get(0);


        return stringList.stream()
                .limit(stringList.size() - 1)
                .filter(s -> !s.equals(""))
                .collect(Collectors.joining(", "))
                + " and "
                + stringList.get(stringList.size() - 1);

    }
}
