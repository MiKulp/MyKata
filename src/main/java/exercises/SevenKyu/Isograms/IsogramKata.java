package exercises.SevenKyu.Isograms;

public class IsogramKata {
    public static void main(String[] args) {
        isIsogram("Alicj");
    }

    public static boolean isIsogram(String str) {

        str = str.toLowerCase();

        for (int i = 0 ; i < str.length() ; i++) {

            char x = str.charAt(i);
            if (str.lastIndexOf(x) != str.indexOf(x))
                return false;

        }

        return true;
    }
}
