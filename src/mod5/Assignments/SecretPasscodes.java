package mod5.Assignments;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscodes {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tPassword Generator Menu");
        System.out.println("*************************************************************");
        System.out.println("*\t[1] Lowercase Letters                                   *");
        System.out.println("*\t[2] Uppercase Letters                                   *");
        System.out.println("*\t[3] Mixture of Upper and Lowercase                      *");
        System.out.println("*\t[4] Numbers and Letters                                 *");
        System.out.println("*\t[5] Quit                                                *");
        System.out.println("*************************************************************");

        boolean quit = false; // Flag for if the program needs to be quit
        Scanner input = new Scanner(System.in); // Input handler
        ArrayList<String> passwords = new ArrayList<>(); // List to hold all the generated passwords

        while (quit != true) {
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("\tInvalid option. Please try again.");
            }
            else {
                if (choice == 5) {
                    System.out.println("\nThank you for using Pass Code Generator.");
                    quit = true;
                }
                else {
                    System.out.print("Length: ");
                    int length = input.nextInt();
                    passwords.add(generatePassword(choice, length));
                }
            }
        }

        // Print out the generated passwords
        System.out.println("Generated passwords: ");
        for (String a: passwords) {
            System.out.println("\t" + a);
        }

    }

    /**
     * Function used to generate random numbers and digits from the ASCII table.
     * @documentation https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
     * @param style
     * @param length
     * @return
     */
    static String generatePassword(int style, int length) {
        Random r = new Random();
        String password = "";

        if (style == 1) {
            for (int i = 0; i < length; i++) {
                char c = (char)(r.nextInt(26) + 'a');
                password += c;
            }
        }
        else if (style == 2) {
            for (int i = 0; i < length; i++) {
                char c  = (char)(r.nextInt(26) + 'A');
                password += c;
            }
        }
        else if (style == 3) {
            for (int i = 0; i < length; i++) {
                char c  = (char)(r.nextInt(58) + 'A');
                if (c > 96 || c < 91)
                    password += c;
            }
        }
        else if (style == 4) {
            for (int i = 0; i < length; i++) {
                char c  = (char)(r.nextInt(74) + '0');
                if ((c < 91 || c > 96) && (c < 58 || c > 64))
                    password += c;
            }
        }
        else {
            System.out.println("Error generating password.");
        }

        return password;
    }
}
