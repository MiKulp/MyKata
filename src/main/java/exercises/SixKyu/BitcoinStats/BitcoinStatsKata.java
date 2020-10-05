package exercises.SixKyu.BitcoinStats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitcoinStatsKata {

    public static void main(String[] args) {

    }

    public static double[][] getMinAvgMax(int discard, double[][] data) {

        double[][] returnArr = new double[data.length + 1][];
        List<Double> dbList = new ArrayList<>();

        for (int i = 0 ; i < data.length ; i++) {

            double[] auxiliaryArr = Arrays
                    .copyOfRange(data[i], discard, data[i]
                            .length - discard);

            returnArr[i] = (new double[]{Arrays.stream(auxiliaryArr).min().orElse(-1),
                    Arrays.stream(auxiliaryArr).average().orElse(-1),
                    Arrays.stream(auxiliaryArr).max().orElse(-1)});

            for (int j = 0 ; j < auxiliaryArr.length ; j++) {
                dbList.add(auxiliaryArr[j]);
            }


        }

            double[] analiseArr = new double[]{dbList.stream().min(Double::compareTo).orElse(-1.0),
                dbList.stream().mapToDouble(Double::doubleValue).average().orElse(-1.0),
                dbList.stream().max(Double::compareTo).orElse(-1.0)};

        returnArr[data.length] = analiseArr;

        return returnArr;

    }
}
