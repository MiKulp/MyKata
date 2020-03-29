package exercises.SevenKyu.GrowthOfPopulation;

public class GrowthPopulationKata {
    public static void main(String[] args) {
        int a = nbYear(1500, 5, 100, 5000);
        System.out.println(a);
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int growthYears = 0;
        double retInt = p0;
        double n = 0;

        while (n < p) {
            n = retInt + (retInt * percent/100) + aug;
            retInt = n;
            growthYears++;

        }
        return growthYears;
    }
}
