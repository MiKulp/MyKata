package exercises.SevenKyu.OfficeIII;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OfficeIIIKata {

    public static String broken(final String x) {

      return Arrays.stream(x.split(""))
                .map(s -> {
                    if (s.equals("1")) {
                        s = "0";
                    } else {
                        s = "1";
                    }
                    return s;
                }).collect(Collectors.joining(""));

    }

}
