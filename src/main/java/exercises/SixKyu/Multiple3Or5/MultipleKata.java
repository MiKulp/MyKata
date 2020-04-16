package exercises.SixKyu.Multiple3Or5;

import java.util.LinkedList;
import java.util.List;

public class MultipleKata {

    public static void main(String[] args) {
int n = solution(10);
        System.out.println(n);
    }

    public static int solution(int number) {
        List<Integer> integerList = new LinkedList<>();

        for (int i = 1 ; i < number ; i++) {
            if (i % 3 == 0 || i % 5 == 0) integerList.add(i);
        }


        return integerList.stream().mapToInt(Integer::intValue).sum();
    }
}
