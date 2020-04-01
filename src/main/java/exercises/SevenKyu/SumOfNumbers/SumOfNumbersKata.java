package exercises.SevenKyu.SumOfNumbers;

public class SumOfNumbersKata {
    public static void main(String[] args) {
        System.out.println(GetSum(-1, 0));
    }

    public static int GetSum(int a, int b) {
        int returnInt = 0;
        if (a > b) {
            for (int i = b ; i <= a ; i++) {
                returnInt += i;
            }
        }
        if (a < b) {
            for (int i = a ; i <= b ; i++) {
                returnInt += i;
            }
        }
        if (a == b) return a;

        return returnInt;
    }
}
