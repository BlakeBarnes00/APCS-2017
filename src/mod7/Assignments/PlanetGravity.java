package mod7.Assignments;

public class PlanetGravity {
    public static void main(String[] args) {
        String[] planets    = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        double[] diameter   = { 4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532 };
        double[] mass       = { 3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26 };

        print(planets, diameter, mass);
    }

    public static void print(String[] p, double[] d, double[] m) {
        System.out.printf("%40s %n", "Planetary Data");
        System.out.printf("%s %20s %20s %20s %n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("---------------------------------------------------------------------");
        for(int i = 0; i < p.length; i++) {
            System.out.printf("%-13s %9.1f \t\t\t%11.2e \t%13.2f %n", p[i], d[i], m[i], calculate(d[i], m[i]));
        }
    }

    public static double calculate(double d, double m) {
        double gravityConstant = 6.67e-11;
        return ((gravityConstant) / m) / d;
    }
}
