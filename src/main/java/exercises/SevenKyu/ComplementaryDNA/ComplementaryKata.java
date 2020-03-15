package exercises.SevenKyu.ComplementaryDNA;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ComplementaryKata {
    public static void main(String[] args) {
        String s = "CATA";
        System.out.println(
                makeComplement(s));
    }

    public static String makeComplement(String dna) {

        String[] arrayWithStrings = new String[dna.length()];

        for (int i = 0 ; i < dna.length() ; i++) {
            arrayWithStrings[i] = dna.substring(i, i + 1);
        }

        for (int i = 0 ; i < arrayWithStrings.length ; i++) {
            if (arrayWithStrings[i].equals("A"))
                arrayWithStrings[i] = "T";
            else if (arrayWithStrings[i].equals("T"))
                arrayWithStrings[i] = "A";
            else if (arrayWithStrings[i].equals("G"))
                arrayWithStrings[i] = "C";
            else if (arrayWithStrings[i].equals("C"))
                arrayWithStrings[i] = "G";
        }

        return Arrays.stream(arrayWithStrings).collect(Collectors.joining());
    }
}
