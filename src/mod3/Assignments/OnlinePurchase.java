package mod3.Assignments;

import java.util.Scanner;

/**
 * A Challenge Program
 *
 * @author Ellis Barnes
 * @version 09/23/2017
 */

public class OnlinePurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the name and then split it at the space
        System.out.print("Enter your first and last name: ");
        String[] name = scanner.nextLine().split(" ");

        System.out.print("Enter the date(mm/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.print("What movie would you like to see? ");
        String movie = scanner.nextLine();

        System.out.print("How many Tickets? ");
        int amountOfTickets = scanner.nextInt();

        System.out.print("What is the cost per ticket? ");
        double ticketCost = scanner.nextDouble();

        System.out.print("Enter debit number (####-###-####): ");
        String cardInfo = scanner.next();

        System.out.println("\n\nYour e-Receipt\n");
        System.out.println(date.replace('/', '-'));
        System.out.println("Order Number: "
                + name[0].charAt(0) + name[1].charAt(0) + date.substring(date.length() - 4, date.length()));

        System.out.println("\t" + name[0].charAt(0) + ". " + name[1]);
        System.out.println("\tAccount: ####-###-" + cardInfo.substring(9));
        System.out.println("\tMovie: " + movie);
        System.out.println("\tTickets: " + amountOfTickets);
        System.out.println("\tCost: " + ticketCost * amountOfTickets);
        System.out.println("\tThanks for visiting!");
    }
}
