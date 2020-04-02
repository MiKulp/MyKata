package exercises.SixKyu.BitCounting;

public class BitCountingKata {
    public static void main(String[] args) {
int n = countBits(16);
        System.out.println(n);
    }

    public static int countBits(int n){
        // Show me the code!

        String s = Integer.toBinaryString(n);
        s = s.replaceAll("0", "");

        return s.length();
    }
}
