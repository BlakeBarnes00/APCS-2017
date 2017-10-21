package mod2.Lessons;

/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *
 * @author Ellis Barnes
 * @version 09/04/2017
 */
public class CalculationsV4 {
    public static void main(String[] args) {

        // Declarations
        int iNum1 = 25;
        int iNum2 = 9;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println("43.21 + 3.14 + 10.0 = " + (43.21 + 3.14 + 10.0));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println("11 - " + iNum2  + " - " + iNum1 + " = " + (11 - iNum2 - iNum1));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum1));
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println("11 % " + iNum2 + " = " + (11 % iNum2));
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();

        // 2.03 Additional int Equations
        System.out.println( iNum1 + "(" + iNum1 + " / " + iNum2 + ") = " + (iNum1 * (iNum1/iNum2)) );
        System.out.println( iNum1 + " * " + iNum1 + " = " + (iNum1 * iNum1));
        System.out.println( iNum2 + " / " + iNum1 + " / " + iNum2 + " = " + (iNum1 / iNum1 / iNum2));
    }
}
