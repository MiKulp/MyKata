package exercises.SixKyu.StringArrayDuplicates;

public class StringArrayKata {


    public static String[] dup(String[] arr) {

        String[] returnArr = new String [arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
           returnArr[i] = removeCharFromString(arr[i]);
        }

        return returnArr;
    }

    private static String removeCharFromString(String s) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0 ; i < s.length()-1 ; i++) {

            if (s.charAt(i) != s.charAt(i+1)) {
                builder.append(s.charAt(i));
            }
        }

        builder.append(s.charAt(s.length()-1));

        return builder.toString();
    }
}
