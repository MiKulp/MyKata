package exercises.SixKyu.ArrayCodewar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCodewarKata {

    public static void main(String[] args) {
        System.out.println(codewarResult(new int[]{1, 2, 2, 1}, new int[]{3, 1, 2, 3}));


    }

    public static String codewarResult(int[] codewarrior, int[] opponent) {

        List<Integer> workList = Arrays.stream(opponent).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int returnInt = 0;

        for (int i = 0 ; i < codewarrior.length ; i++) {

            for (int j = 0 ; j < workList.size() ; j++) {

                if (codewarrior[i] > workList.get(j) && workList.get(j) > 0) {
                    returnInt++;
                    workList.set(j, -1);
                    break;
                }
            }

            for (int j = 0 ; j < workList.size() ; j++) {

                if (codewarrior[i] == workList.get(j) && workList.get(j) > 0) {
                    workList.set(j, -2);
                    break;
                }
            }


            for (int j = 0 ; j < workList.size() ; j++) {

                if (codewarrior[i] < workList.get(j)  && workList.get(j) > 0) {
                    returnInt--;
                    workList.set(j, -3);
                    break;
                }
            }


        }

        System.out.println(returnInt);
        System.out.println("***********************************");
        System.out.println(workList);

        if (returnInt > 0) return "Victory";
        else if (returnInt < 0) return "Defeat";
        else return "Stalemate";
    }

}
