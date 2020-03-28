package exercises.SevenKyu.AlternateCapialization;

public class AlternateCapitalizationKata {
    public static void main(String[] args) {
        capitalize("abcd");
    }

    public static String[] capitalize(String s) {
        StringBuilder sbFirst = new StringBuilder();
        StringBuilder sbSecond = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++) {
            if ((i & 1) == 0) {
                sbSecond.append(String.valueOf(s.charAt(i)).toUpperCase());
                sbFirst.append(String.valueOf(s.charAt(i)).toLowerCase());
            } else {
                sbSecond.append(String.valueOf(s.charAt(i)).toLowerCase());
                sbFirst.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
        }

        return new String[] {sbSecond.toString(), sbFirst.toString()};
    }
}
