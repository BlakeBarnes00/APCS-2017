package mod2.Assignments;

import java.util.Random;

/**
 * This is to show my understand shortcuts in Java
 *
 * @author Ellis Barnes
 * @version 09/11/17
 */
public class Grades {
    // Made these global so that I can use them in my function
    static int numTests = 0;
    static int testGrade = 0;
    static int totalPoints = 0;
    static double average = 0.0;

    public static void main(String args[]) {
        // These are the tests that are already given before
        Test(95);
        Test(73);
        Test(91);
        Test(82);

        // My custom tests (I randomly will generate the grade to be between 60-100
        Random random = new Random();
        int min = 60, max = 100;
        for (int i = 0; i < 5; i++) {
            Test(random.nextInt((max - min) + 1) + min);
        }

    }

    static int Test(int grade) {
        numTests++;
        totalPoints = totalPoints + grade; // This can also be written 'totalPoints += grade;'
        average = totalPoints / (double) numTests;
        System.out.println("Test #" + numTests + " Grade: " + grade + " Points: " + totalPoints + " Average: " + average);
        return grade;
    }
}
