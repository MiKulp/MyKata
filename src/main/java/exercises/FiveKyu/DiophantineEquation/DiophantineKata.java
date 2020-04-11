package exercises.FiveKyu.DiophantineEquation;

import java.util.LinkedList;
import java.util.List;

public class DiophantineKata {

    public static void main(String[] args) {
        String s = solEquaStr(5);
        System.out.println(s);
    }

    public static String solEquaStr(long n) {
        double sq = Math.sqrt(n);
        List<Long> doubleList = new LinkedList<>();
        List<Long> onceList = new LinkedList<>();
       String returnString = "";

        if (n % 2 != 0) {
            doubleList.add(1l);
            doubleList.add(n);
        }

        for (long i = 2 ; i <= sq ; i++) {

            if (n % i == 0) {

                if (n / i == i) {
                    doubleList.add(i);
                    doubleList.add(i);
                }

                else{
                    doubleList.add(i);
                    doubleList.add(n / i);
                }

            }
        }

        if (doubleList.size() == 0 && onceList.size() == 0) return "";

        System.out.println("doubleList " + doubleList);
        System.out.println("onceList " + onceList);

        double y = 0;
        double x = 0;

        for (int i = 0 ; i < doubleList.size() ; i = i + 2) {

            y = ((double) doubleList.get(i + 1) - (double) doubleList.get(i)) / 4;
            System.out.println(y);

            x = (double) doubleList.get(i) + (2 * (y));
            System.out.println(x);

            if (x % 1 == 0 && y % 1 == 0) {

               returnString = returnString.concat("[" + (int) x +", " + (int) y +"]");

            }
        }

        return returnString;
    }


}
