package exercises.FiveKyu.Scramblies;

import java.util.Arrays;

public class ScrambliesKata {
    public static void main(String[] args) {
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
    }

    public static boolean scramble(String str1, String str2) {

        if (str2.length() > str1.length()) return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0 ; i < arr2.length  ; i++) {

            for (int j = 0 ; j < arr1.length ; j++) {

                if (arr1[j] == arr2[i]) {
                    arr1[j] = ' ';
                    arr2[i] = ' ';
                }
            }
        }

        String s = String.valueOf(arr2);
        s = s.replaceAll(" ", "");

        return s.length() == 0 ? true : false ;
    }
}
