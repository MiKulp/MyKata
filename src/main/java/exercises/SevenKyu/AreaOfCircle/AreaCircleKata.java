package exercises.SevenKyu.AreaOfCircle;

public class AreaCircleKata {
    public static void main(String[] args) {
       double d = area(68);
        System.out.println(d);
    }


    public static double area(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("false");
        return Math.round ((Math.PI * Math.pow(radius, 2))*100.0) / 100.0;
    }
}
