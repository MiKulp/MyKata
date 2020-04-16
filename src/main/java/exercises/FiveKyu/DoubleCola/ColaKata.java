package exercises.FiveKyu.DoubleCola;

import java.util.ArrayDeque;
import java.util.Queue;

public class ColaKata {
    public static void main(String[] args) {
        long n = System.currentTimeMillis();
        System.out.println(WhoIsNext ( new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 17));
        System.out.println((System.currentTimeMillis()-n)/1000);
    }

    public static String WhoIsNext(String[] names, int n) {

        Queue<String> stringQueue = new ArrayDeque<>();

        for (int i = 0 ; i < names.length ; i++) {
            stringQueue.add(names[i]);
        }

        for (int i = 0 ; i < n-1  ; i++) {
            String temp = stringQueue.remove();
            stringQueue.add(temp);
            stringQueue.add(temp);
        }

        System.out.println(stringQueue);

        return stringQueue.remove();
    }
}
