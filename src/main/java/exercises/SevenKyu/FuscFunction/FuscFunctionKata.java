package exercises.SevenKyu.FuscFunction;

public class FuscFunctionKata {
    public static void main(String[] args) {

        System.out.println(fusc (85));
    }

    public static int fusc(int n) {
        // Your code here!
        if (n == 0) return 0;

        else if (n == 1) return 1;

        else if ((n & 1) != 0) return fusc((n - 1)/2) + fusc(((n - 1)/2)+1);

        else return fusc(n/2);

    }
}
