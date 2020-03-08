package exercises.SixKyu.DetectPangram;

public class PangramChecker {

    public static void main(String[] args) {
        System.out.println(check("nhmryxtbcs f l peq d wko uiv"));
    }

    public static boolean check(String sentence) {

        if (sentence.length() < 25) {
            return false;
        }

        sentence = sentence.toLowerCase();
        boolean bool = true;


        int[] arrayASCII = new int[]
                {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
                        119, 120, 121, 122};

        for (int i = 0 ; i < arrayASCII.length ; i++) {
            boolean auxilliaryBool = false;

            for (int j = 0 ; j < sentence.length() ; j++) {

                if (arrayASCII[i] == (int) sentence.charAt(j)) {
                    auxilliaryBool = true;
                    break;
                }
            }

            if (!auxilliaryBool) {

                return false;
            }

        }

        return bool;
    }
}
