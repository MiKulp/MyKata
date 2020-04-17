package exercises.FourKyu.Strip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StripCommentsKata {
    public static void main(String[] args) {

    }

    public static String stripComments(String text, String[] commentSymbols) {

        List<String> list = Arrays.stream(text.split("\\n")).collect(Collectors.toList());


        for (int i = 0 ; i < list.size()  ; i++) {
            String temp = list.get(i);
            list.remove(i);

            for (int j = 0 ; j < commentSymbols.length  ; j++) {

                if (temp.contains(commentSymbols[j])) {
                    int x = temp.indexOf(commentSymbols[j]);
                    temp = temp.substring(0, x);
                }
                    temp = temp.replaceAll("( )+$", "");
            }

            list.add(i, temp);
        }

        return list.stream().collect(Collectors.joining("\n"));
    }


}
