package exercises.SixKyu.LongestSubstring;

public class SubstringKata {

    public static void main(String[] args) {
        longestAlpabeticalSubstring("asd");
    }


    public static String longestAlpabeticalSubstring(String text) {

        char[] arr = text.toCharArray();
        StringBuilder builder = new StringBuilder();

        String returnString = "";

        for (int i = 0 ; i < arr.length ; i++) {

            builder.append(arr[i]);

            for (int i1 = i ; i1 < arr.length - 1 ; i1++) {

                if (arr[i1 + 1] >= arr[i1]) {
                    builder.append(arr[i1 + 1]);
                } else break;
            }

            if (builder.length() > returnString.length()) {
                returnString = builder.toString();
            }

            builder.replace(0, builder.length(), "");

        }

        return returnString;
    }
}

