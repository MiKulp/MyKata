package exercises.SevenKyu.OfficeIV;

import java.util.Optional;

public class OfficeIVKata {


    public static Object meeting(char[] x) {

       String s = String.valueOf(x);

       if (s.contains("O")) {
           return s.indexOf('O');
       } else return "None available!";

    }
}
