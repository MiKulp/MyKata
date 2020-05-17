package exercises.SevenKyu.JumpingNumber;

import java.util.ArrayList;
import java.util.List;

public class JumpingNumberKata {


    public static String jumpingNumber(int number) {
        List <Integer> integers = new ArrayList<>();
        int n = number;

        while (n > 0) {
            integers.add(n % 10);
            n = n / 10;
        }

        for (int i = 0 ; i < integers.size()-1 ; i++) {
            int x = integers.get(i) - integers.get(i+1);
            if (x == 0 || x < -1 || x > 1 ) return "Not!!";
        }

        return "Jumping!!";
    }
}
