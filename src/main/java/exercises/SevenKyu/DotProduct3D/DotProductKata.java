package exercises.SevenKyu.DotProduct3D;

public class DotProductKata {

    public static void main(String[] args) {

    }

    public static double dotProduct(final Vector3D a, final Vector3D b) {
        return (a.x * b.x) + (a.y * b.y) * (a.z * b.z);
    }

    private static class Vector3D {
        int x, y, z;

        public Vector3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
