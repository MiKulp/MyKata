package exercises.SixKyu.SumConsecutiveNumbers;

import java.util.LinkedList;
import java.util.List;

public class SumNumbersKata {

    public static List<Integer> sumConsecutives(List<Integer> s) {

        List<Integer> returnList = new LinkedList<>();

        returnList.add(s.get(0));
        for (int i = 1 ; i < s.size() ; i++) {
            if (s.get(i - 1).equals(s.get(i))) {
                returnList.set(returnList.size() - 1, (returnList.get(returnList.size() - 1) + s.get(i)));
            } else {
                returnList.add(s.get(i));
            }
        }

        return returnList;
    }


}
