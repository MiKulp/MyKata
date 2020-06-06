package exercises.SixKyu.Encrypt;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EncryptKata {

    public static String encryptThis(String text) {
        if (text.length() == 0) return "";

        List<String> stringList = Arrays.asList(text.split(" "));


        List<String> returnList = new LinkedList<>();

        for (String s : stringList) {
            StringBuilder builder = new StringBuilder();

            builder.append((int) s.charAt(0));
            if (s.length() > 2) builder.append(s.charAt(s.length() - 1));
            if (s.length() > 2) builder.append(s.substring(2, s.length() - 1));
            if (s.length() > 1) builder.append(s.charAt(1));

            returnList.add(builder.toString());

        }

        return returnList.stream().collect(Collectors.joining(" "));
    }
}
