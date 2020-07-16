package exercises.SevenKyu.TidyNumbers;

public class TidyKata {

    public static boolean tidyNumber(int number) {
        int nr = number;
        int a, b;

        while (nr > 0) {

            a = nr % 10;
            b = (nr / 10) % 10;
            if (a < b) return false;
            nr = nr / 10;
        }

        return true;
    }
}
