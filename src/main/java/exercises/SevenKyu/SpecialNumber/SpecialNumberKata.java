package exercises.SevenKyu.SpecialNumber;

public class SpecialNumberKata {

    public static String specialNumber(int number) {

        int workNumber = number;

        while (workNumber > 0) {
            if (workNumber % 10 > 5) return "NOT!!";
            workNumber = workNumber / 10;
        }

        return "Special!!";
    }
}
