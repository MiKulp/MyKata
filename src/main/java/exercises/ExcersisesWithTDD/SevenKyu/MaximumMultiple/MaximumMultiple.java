package exercises.ExcersisesWithTDD.SevenKyu.MaximumMultiple;

public class MaximumMultiple {

    public static int maxMultiple(int divisor, int bound) {

        for (int i = bound ; i > 0  ; i--) {
            if (i % divisor == 0) {
                return i;
            }
        }
        return -1;
    }
}
