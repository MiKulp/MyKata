package exercises.FiveKyu.JosephusPermutation;

import java.util.*;

public class PermutationKata {

    public static void main(String[] args) {


    }


    public static <T> List<T> printJosephusPositions(List<T> items, int k) {
        int count = items.size();
        Queue<Integer> integerQueue = new ArrayDeque<>();

        List<T> returnList = new LinkedList<>();

        for (int i = 1 ; i <= count ; i++) {
            integerQueue.add(i);
        }
        

        while (!integerQueue.isEmpty()) {
            System.out.println("integerQueue.size() " +integerQueue.size());

            for (int i = 1 ; i <= k ; i++) {
                int eliminatedPosition = integerQueue.remove();
                System.out.println("eliminated " +eliminatedPosition);
                System.out.println("integerQueue.size() in loop " +integerQueue.size());

                if (i == k) {
                    returnList.add(items.get(eliminatedPosition - 1));
                    break;
                }

                integerQueue.add(eliminatedPosition);
                System.out.println("integerQueue.size() in end of loop " +integerQueue.size());

            }
        }

        return returnList;

    }

}
