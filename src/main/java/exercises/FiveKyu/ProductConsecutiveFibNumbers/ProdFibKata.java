package exercises.FiveKyu.ProductConsecutiveFibNumbers;

import java.util.ArrayList;
import java.util.List;

public class ProdFibKata {

    public static void main(String[] args) {
//        productFib(5895);
        fibKata(5895);

    }


    public static long[] productFib(long prod) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0, 0);
        fibonacciList.add(1, 1);
        fibonacciList.add(2, 1);

        long[] returnArray = new long[3];

        long n = 0;

        while (true) {
            fibonacciList.add(fibonacciList.size(), fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2));

            n = fibonacciList.get(fibonacciList.size() - 1) * fibonacciList.get(fibonacciList.size() - 2);

            if (n > prod) {
                returnArray[0] = fibonacciList.get(fibonacciList.size() - 2);
                returnArray[1] = fibonacciList.get(fibonacciList.size() - 1);
                returnArray[2] = 0;

                for (long l : returnArray) {
                    System.out.print(l + " ");
                }

                break;
            }

            if (n == prod) {
                returnArray[0] = fibonacciList.get(fibonacciList.size() - 2);
                returnArray[1] = fibonacciList.get(fibonacciList.size() - 1);
                returnArray[2] = 1;

                for (long l : returnArray) {
                    System.out.print(l + " ");
                }

                break;

            }

        }
//        fibonacciList.stream().forEach(System.out::println);

        return returnArray;
    }

    public static void fibKata(long prod) {

        double n = Math.sqrt((double) prod);
        System.out.println("Pierwiastek kwadratowy z n= " +n);


    }

    static boolean isPerfectSquare (int x) {

        int s = (int) Math.sqrt(x);
        return (s * s == x);

    }
}
