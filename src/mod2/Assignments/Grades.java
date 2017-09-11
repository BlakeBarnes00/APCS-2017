package mod2.Assignments;
/**
 * This is to show my understand shortcuts in Java
 *
 * @author Ellis Barnes
 * @version 09/10/17
 */
public class Grades {
    public static void main(String args[]) {
        // Local Variables
        int numTests = 0;
        int testGrade = 0;
        int totalPoints = 0;
        double average = 0.0;

        // Test 1
        numTests++;
        testGrade = 95;
        totalPoints += 95;
        average = totalPoints / (double)numTests;
        System.out.println("Test #" + numTests + " Grade: " + testGrade + " Points: " + totalPoints + " Average: " + average);

        // Test 2
        numTests++;
        testGrade = 73;
        totalPoints += 73;
        average = totalPoints / (double)numTests;
        System.out.println("Test #" + numTests + " Grade: " + testGrade + " Points: " + totalPoints + " Average: " + average);

        // Test 3
        numTests++;
        testGrade = 91;
        totalPoints += 91;
        average = totalPoints / (double)numTests;
        System.out.println("Test #" + numTests + " Grade: " + testGrade + " Points: " + totalPoints + " Average: " + average);

        // Test 4
        numTests++;
        testGrade = 82;
        totalPoints += 82;
        average = totalPoints / (double)numTests;
        System.out.println("Test #" + numTests + " Grade: " + testGrade + " Points: " + totalPoints + " Average: " + average);
    }
}
