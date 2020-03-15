package exercises.SixKyu.PersistentBugger;

public class PersistenBuggerKata {
    public static void main(String[] args) {
        long x = 4;

        System.out.println(persistence(x));

    }

    public static int persistence(long n) {

        long x = persistenceRecursion(n);
        int returnInt = 1;

        if (n <= 9) {
            return 0;
        }

        while (x > 9) {
            x = persistenceRecursion(x);
            returnInt++;
        }

        return returnInt;
    }

    public static long persistenceRecursion(long n) {

        if (n <= 9) {
            return n;
        }

        return (n % 10 * persistenceRecursion(n / 10));
    }


}
