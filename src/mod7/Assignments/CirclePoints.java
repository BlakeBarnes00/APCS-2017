package mod7.Assignments;


/**
 * @author Ellis Barnes
 * @version 1/10/2018
 * Program that finds the Y-value when it has the radius and X-value
 */
public class CirclePoints {
    public static void main(String[] args) {
        System.out.println("Points on a Circle with a Radius of 1.0");
        System.out.println("\t x1 \t\t y1 \t\t x1 \t\t y2");
        System.out.println("**********************************************");
        for(double x = -1.00; x < 1.00; x += 0.10) {
            System.out.printf("\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f %n", x, calculate(x, 1.0), x, (-1 * calculate(x, 1.0)));
        }
    }

    static double calculate(double x, double r) {
        return Math.sqrt(r - x); // For some reason I cannot get the proper output, I have tried several different methods
    }
}
