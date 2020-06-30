package exercises.SevenKyu.IndexedCapitalization;

public class CapitalizationKata {

    public static String capitalize(String s, int[] ind) {

        StringBuilder builder = new StringBuilder(s);

        for (int i = 0 ; i < ind.length ; i++) {
            if (ind[i] < s.length()) {
                builder.replace(ind[i], ind[i] + 1, s.substring(ind[i], ind[i] + 1)
                        .toUpperCase());
            }
        }

        return builder.toString();
    }
}
