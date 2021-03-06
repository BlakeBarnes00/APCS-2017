package mod7.Assignments.Challenge;

import java.util.Random;
import java.util.Scanner;

public class ChallengeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int darts, trials;

        System.out.print("How many darts per trial? ");
        darts = scanner.nextInt();
        System.out.print("How many trials? ");
        trials = scanner.nextInt();

        runTrials(trials, darts);
    }

    public static double getPI(double x, double y) {
        return (Math.pow(x, 2) + Math.pow(y, 2)) * Math.PI;
    }

    // Generates a set of random coordinates
    public static double[] generateCoordinates(int count) {
        Random r = new Random();
        double[] coord = new double[count];

        for(int i = 0; i < count; i++) {
            coord[i] = 0.0 + (1.0 - 0.0) * r.nextDouble();
        }

        return coord;
    }

    public static void runTrials(int trials, int darts) {
        double totalAverage = 0;
        for(int i = 0; i < trials; i++) {
            double average = 0;
            double[] x = generateCoordinates(darts), y = generateCoordinates(darts);

            for(int j = 0; j < darts; j++) {
                average += getPI(x[j], y[j]) / darts;
            }

            System.out.printf("Trial [%2d]: PI = %2.6f %n" ,i+1 ,average);
            totalAverage += average / trials;
        }
        System.out.printf("Estimate of PI = %2.6f%n", totalAverage);
    }
}
