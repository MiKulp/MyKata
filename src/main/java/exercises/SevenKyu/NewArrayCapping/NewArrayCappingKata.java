package exercises.SevenKyu.NewArrayCapping;

import java.util.Arrays;

public class NewArrayCappingKata {

    public static String[] capMe(String[] strings) {

       return Arrays.stream(strings)
               .map(String::toLowerCase)
               .map(s -> s.replaceFirst(s.substring(0,1),s.substring(0,1).toUpperCase()))
               .toArray(String[]::new);

    }
}
