package exercises.SevenKyu.DivisibilityBySeven;

public class DivisibilityKata {

    public static void main(String[] args) {
        long[] arr = new long[]{372, 0};
        long[] array = rec(arr);

    }

    public static long[] seven(long m) {
        return rec(new long[] {m, 0});
    }


    public static long[] rec(long[] lonarr) {
        long step = lonarr[1];
        long returnLong = lonarr[0];
        long x, y, z;

        if (lonarr[0] < 99) {
            return new long[]{returnLong, step};
        } else
            step++;
        y = returnLong % 10;
        x = returnLong / 10;
        z = x - (2 * y);

        return rec(new long[]{z, step});
    }
}
