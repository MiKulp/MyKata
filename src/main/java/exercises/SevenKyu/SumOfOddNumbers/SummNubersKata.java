package exercises.SevenKyu.SumOfOddNumbers;

import java.util.jar.JarOutputStream;

public class SummNubersKata {
    public static void main(String[] args) {
       int n = rowSumOddNumbers(3);
        System.out.println(n);
    }

    public static int rowSumOddNumbers(int n) {

        if (n == 1)
            return 1;

        int startInt = (n * (n - 1) + 1);

        return (startInt * n) + (n * (n - 1));
    }


}
