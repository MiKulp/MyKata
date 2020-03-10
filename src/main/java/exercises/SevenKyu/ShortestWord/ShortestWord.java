package exercises.SevenKyu.ShortestWord;

import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {

       int m = findShort("bitcoin take over the world maybe who knows perhaps");
        System.out.println(m);
    }

    public static int findShort(String s) {

        String[] stringArray = s.split(" ");
        return  ((int) Arrays.stream(stringArray).mapToLong(value -> value.length()).min().getAsLong());
    }
}
