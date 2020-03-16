package exercises.EightKyu.CirclesInPolygon;

public class PolygonKata {

    public static void main(String[] args) {
        double d = circleDiameter(3, 4);
        System.out.println(d);
    }

    public static double circleDiameter(int sides, int sideLength) {

        double ctg = Math.cos(Math.PI / sides) / Math.sin(Math.PI / sides);
        return   ctg * sideLength;
    }
}
