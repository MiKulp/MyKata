package exercises.SevenKyu.RowWeight;

public class RowKata {

    public static int[] rowWeights(final int[] weights) {

        int sdTeam = 0;
        int ftTeam = 0;

        for (int i = 0 ; i < weights.length ; i++) {
            if (i % 2 == 0) sdTeam = weights[i] + sdTeam;
            else ftTeam = weights[i] + ftTeam;

        }
        return new int[]{sdTeam, ftTeam};
    }
}
