package mod7.Assignments;

import java.util.Scanner;

/**
 * @author Ellis Barnes
 * @version 12/10/2017
 * Program to demonstrate the use of static functions
 */
public class PlanetWeight {
    public static void main(String[] args) {
        String[] planets    = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        double[] gravity    = { 3.70, 8.87, 9.79, 3.70, 24.78, 10.44, 8.86, 11.13 };
        //double[] weight     = { 37.79, 90.60, 100.00, 37.79, 253.12, 106.64, 90.50, 113.69 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weight: ");
        double weight = sc.nextDouble();
        print(planets, gravity, weight);
    }

    // Convert the weight from LBS to grams
    public static double toMetric(double weight, double gravity) {
        // 1 LBS = 433.59237; 9.8 is earths gravity (scales others to the same ratio)
        double m = weight * (433.59237) / (gravity/9.8);
        return m;
    }

    public static void print(String[] p, double[] g, double w) {
        System.out.printf("%31s %n", "Planetary Data");
        System.out.printf("%s %20s %20s %n", "Planet", "Gravity", "Weight (lbs)");
        System.out.println("------------------------------------------------");
        for(int i = 0; i < p.length; i++) {
            double grams = toMetric(w, g[i]);

            System.out.printf("%-13s %11.2f %19.2e %n", p[i], g[i], grams);
        }
    }
}
