package exercises.SixKyu.BackspaceInString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackspaceKata {

    public String cleanString(String s) {
        String workString = s;

        Pattern pattern = Pattern.compile("#");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) workString = workString.replaceFirst(".#", "");

        return workString.replace("#", "");
    }

}
