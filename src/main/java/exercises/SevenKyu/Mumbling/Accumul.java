package exercises.SevenKyu.Mumbling;

public class Accumul {
    public static void main(String[] args) {
        System.out.println(
        accum("abcd"));
    }

    public static String accum(String s) {
        s = s.toLowerCase();
        char[] arrayChar = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0 ; i < arrayChar.length ; i++) {
            builder.append(String.valueOf(arrayChar[i]).toUpperCase());

            for (int j = 0 ; j < i ; j++) {
                builder.append(arrayChar[i]);
            }

            if (i < arrayChar.length-1) {
                builder.append('-');
            }
        }
        return builder.toString();
    }
}
