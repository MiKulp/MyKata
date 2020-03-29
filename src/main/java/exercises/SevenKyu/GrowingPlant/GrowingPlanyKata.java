package exercises.SevenKyu.GrowingPlant;

public class GrowingPlanyKata {

    public static void main(String[] args) {
        int n = growingPlant(72, 6, 660);
        System.out.println(n);
    }

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int growthInEndOfDay = upSpeed;
        int growthDay = 1;

        while (desiredHeight > growthInEndOfDay) {

            growthInEndOfDay += (upSpeed-downSpeed);
            growthDay++;
        }



        return growthDay;

    }


}
