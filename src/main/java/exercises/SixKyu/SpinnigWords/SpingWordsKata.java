package exercises.SixKyu.SpinnigWords;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpingWordsKata {


    public static void main(String[] args) {
       String exit =  spinWords("Hey fellow warriors");
        System.out.println(exit);
    }

    public static String spinWords(String sentence) {

        List<String> arrList = Arrays.asList(sentence.split(" "));

        return arrList.stream()
                .map(StringBuilder::new)
                .map(stringBuilder -> {
                    if (stringBuilder.length() > 5) {
                        stringBuilder.reverse().toString();
                    } else
                        stringBuilder.toString();
                    return stringBuilder.toString();
                })
                .collect(Collectors.joining(" "));

    }
}
