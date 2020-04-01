package exercises.SevenKyu.StringEnd;

public class StringEndKata {
    public static void main(String[] args) {

        System.out.println(solution("", "ac"));
    }

    public static boolean solution(String str, String ending) {

        if (ending.length() < str.length()) return false;

        int n = str.length()-1;

        for (int i = ending.length()-1 ; i >= 0 ; i--, n--) {
           if (ending.charAt(i) != str.charAt(n)) return false;
        }

        return true;
    }
}
