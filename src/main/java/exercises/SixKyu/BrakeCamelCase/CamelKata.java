package exercises.SixKyu.BrakeCamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelKata {
    public static void main(String[] args) {
        String s = camelCase("camelCasingTest");
        System.out.println(s);
    }

    public static String camelCase(String input) {
       return Arrays.stream(input.split("(?=[A-Z])")).collect(Collectors.joining(" "));
    }
}
