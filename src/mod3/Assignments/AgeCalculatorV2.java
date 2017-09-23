package mod3.Assignments;

/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
import java.util.Scanner;
public class AgeCalculatorV2
{
    public static void main(String[] args)
    {
    	//construct a Scanner object called in
        Scanner in = new Scanner(System.in);

        String firstName;


		//ask user for input
        System.out.print("Please enter your name (first last): ");
        firstName = in.next();
        String lastName = in.nextLine();
        System.out.println();

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        String ageInYears = userAge;

		//calculate age in minutes
        double approxAgeInDays = Integer.parseInt(ageInYears) * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.substring(0, 3);
        String name = firstInitial  + ". " + lastName;

		// display name and minutes to screen
        System.out.print("Name: " + name);
        System.out.println("\t\t Age in Minutes: " + ageInMinutes);
    }
}