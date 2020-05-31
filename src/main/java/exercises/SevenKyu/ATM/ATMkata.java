package exercises.SevenKyu.ATM;

public class ATMkata {

    public int solve(int n) {

        if (n % 10 > 0) return -1;

        int[] arr = new int[] {500, 200, 100, 50, 20, 10};
        int auxInt = n;
        int counter = 0;

        while (auxInt != 0) {

            for (int i = 0 ; i <arr.length  ; i++) {

                if (auxInt >= arr[i]) {
                    auxInt -= arr[i];
                    counter++;
                    break;
                }

            }

        }
        return counter;
    }

}
