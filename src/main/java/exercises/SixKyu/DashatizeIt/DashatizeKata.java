package exercises.SixKyu.DashatizeIt;

public class DashatizeKata {


    public static String dashatize(int num) {

        if (num < 10 && num >= 0) return String.valueOf(num);
        else if (num > -10 && num < 0) return String.valueOf(num * -1);

        StringBuilder returnString = new StringBuilder();
        long numForUse;

        if (num < 0) {
            numForUse = num * -1l;
        } else numForUse = num;

        while (numForUse > 0) {
            long x = numForUse % 10;

            if (x % 2 == 0) {
                returnString.append(x);
            } else {
                returnString.append("-" + x + "-");
            }

            numForUse = numForUse / 10;
        }

        if (returnString.charAt(returnString.length()-1) == '-') {
            returnString.delete(returnString.length()-1, returnString.length());
        }

        if (returnString.charAt(0) == '-') {
            returnString.delete(0, 1);
        }

        String s = returnString.reverse().toString();

        s = s.replaceAll("--", "-");

        return s;
    }


}
