package mod3.Assignments;

import java.util.Scanner;

/**
 * This is to show my understand shortcuts in Java
 *
 * @author Ellis Barnes
 * @version 09/11/17
 */
public class GradesV3 {
    // Made these global so that I can use them in my function
    static int numTests = 0;
    static int totalPoints = 0;
    static double average = 0.0;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        for(int i = 0; i < 3; i++) {
            System.out.print(name + ", enter subject and grade: ");
            Test(input.next(), input.nextInt());
        }
    }

    static int Test(String subject, int grade) {
        numTests++;
        totalPoints = totalPoints + grade; // This can also be written 'totalPoints += grade;'
        average = totalPoints / (double)numTests;

        System.out.println("\tSubject: " + subject + " Grade: " + grade);
        System.out.println("\tOverall Points: " + totalPoints + " \n\tOverall Average: " + average + "\n");

        return grade;
    }
}
