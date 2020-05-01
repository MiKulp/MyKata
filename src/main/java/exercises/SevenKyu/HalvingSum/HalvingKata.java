package exercises.SevenKyu.HalvingSum;

public class HalvingKata {

    public static void main(String[] args) {
    }

    public static int halvingSum(int n) {
        return recHalving(n, 0);
    }

    public static int recHalving (int n, int m) {

        if (n == 0) return m;

        else {
            m += n;
            return recHalving(n/2, m);
        }
    }
}
