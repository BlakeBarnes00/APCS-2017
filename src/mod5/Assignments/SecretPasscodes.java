package mod5.Assignments;

import java.util.Scanner;

public class SecretPasscodes {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tPassword Generator Menu");
        System.out.println("*************************************************************");
        System.out.println("*\t[1] Lowercase Letters                                   *");
        System.out.println("*\t[2]                                                     *");
        System.out.println("*\t[3]                                                     *");
        System.out.println("*\t[4]                                                     *");
        System.out.println("*\t[5] Quit                                                *");
        System.out.println("*************************************************************");

        boolean quit = false; // Flag for if the program needs to be quit
        Scanner input = new Scanner(System.in); // Input handler

        while (quit != true) {
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("\tInvalid option. Please try again.");
            }
            else {
                if (choice == 1) {
                    System.out.println("Choice one!");
                }
                else if (choice == 5) {
                    System.out.println("Thank you for using Pass Code Generator.");
                    quit = true;
                }
            }
        }

        System.out.println("Program terminated.");

    }
}
