package exercises.SixKyu.CamelCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CamelCaseKata {

    public static void main(String[] args) {
        String s = camelCase("   camel case word");
        System.out.println(s);
    }

    public static String camelCase(String str) {
        if (str.length() == 0) return "";

        List<String> stringList = Arrays.stream(str.split(" "))
                .map(s -> s.replaceAll("[ ]+", ""))
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());

        return stringList.stream()
                .map(s -> s.substring(0, 1)
                        .toUpperCase()
                        .concat(s.substring(1)))
                        .collect(Collectors.joining(""));

    }

}
