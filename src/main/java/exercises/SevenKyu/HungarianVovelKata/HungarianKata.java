package exercises.SevenKyu.HungarianVovelKata;

public class HungarianKata {


    public static String dative(String word) {

        String frontVowel = "eéiíöőüű";
        String backVowel = "aáoóuú";

        String wordToUse = new StringBuilder(word)
                .reverse()
                .toString();


        for (int i = 0 ; i < wordToUse.length() ; i++) {

            if (frontVowel.indexOf(wordToUse.charAt(i)) != -1) {
                return word + "nek";
            } else if (backVowel.indexOf(wordToUse.charAt(i)) != -1) {
                return word + "nak";
            }
        }

        return word;
    }
}
