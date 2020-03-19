package exercises.SixKyu.DuplicateEncoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoderKata {

    public static void main(String[] args) {
        encode("recede");
    }

    static String encode(String word) {

        String duplicateChars = "";
        List<Character> charList = word.toLowerCase().chars().mapToObj(value -> (char) value).collect(Collectors.toList());
        Map<Character, Long> mapCharacters = charList.stream().collect(Collectors.groupingBy(character -> character, Collectors.counting()));


        for (int i = 0 ; i < charList.size() ; i++) {

            if (mapCharacters.get(charList.get(i)) > 1) {
                duplicateChars = duplicateChars + ")";
            } else {
                duplicateChars = duplicateChars + "(";
            }
        }


        return duplicateChars;
    }
}
