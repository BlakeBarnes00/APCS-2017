package mod6.Assignments;

/**
 * Annual Weather description: Program that displays average
 * temperature and precipitation.
 *
 * @author Ellis Barnes
 * @version 12/18/2017
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class AnnualWeatherV2 {
    public static void main(String[] args) {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);

        String tempLabel = "";
        String precipLabel = "";

        System.out.print("Choose the temperature scale (F or C): ");
        String choice = in.nextLine();
        if (choice.equalsIgnoreCase("C"))
            tempLabel = choice;
        else if (choice.equalsIgnoreCase("F"))
            tempLabel = "F";

        System.out.print("Choose the precipitation scale (I or C): ");
        choice = in.nextLine();
        if (choice.equalsIgnoreCase("I"))
            precipLabel = "in.";
        else if (choice.equalsIgnoreCase("C"))
            precipLabel = "cm.";

        String city = "Vero Beach";
        String state = "Florida";

        String[] month = {
                "Jan.", "Feb.", "Mar.", "Apr.",
                "May.", "Jun.", "Jul.", "Aug.",
                "Sep.", "Oct.", "Nov.", "Dec."
        };

        double[] temperature = {
                63.0, 63.9, 67.7, 71.5,
                76.2, 80.4, 81.7, 81.6,
                80.7, 76.4, 70.5, 64.7
        };     //initialize with Fahrenheit values
        double[] precipitation = {
                2.9, 2.5, 4.2, 2.9,
                3.8, 6.0, 6.5, 6.0,
                6.87, 5.0, 3.0, 2.2
        };      //initialize with inch values

        double totalTemp = 0, totalPrecip = 0;
        //Processing - calculate average temperature and total precipitation
        for (int index = 0; index < temperature.length; index++) {
            totalTemp += temperature[index];
            totalPrecip += precipitation[index];
        }


        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println("Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();

        System.out.println("***************************************************");

        // Limit the decimal formats to two digits
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        for (int index = 0; index < temperature.length; index++) {
            if (tempLabel.equalsIgnoreCase("C") && precipLabel.equalsIgnoreCase("cm."))
                System.out.println(month[index] + "\t\t\t" +
                        numberFormat.format(((temperature[index]-32)/1.8)) +
                        "\t\t\t\t" + numberFormat.format(precipitation[index]*2.54));

            else if (tempLabel.equalsIgnoreCase("F") && precipLabel.equalsIgnoreCase("cm."))
                System.out.println(month[index] + "\t\t\t" +
                        numberFormat.format(temperature[index]) +
                        "\t\t\t\t" + numberFormat.format(precipitation[index]*2.54));

            else if (tempLabel.equalsIgnoreCase("C") && precipLabel.equalsIgnoreCase("in."))
                System.out.println(month[index] + "\t\t\t" +
                        numberFormat.format(((temperature[index]-32)/1.8)) +
                        "\t\t\t\t" + numberFormat.format(precipitation[index]));

            else if (tempLabel.equalsIgnoreCase("F") && precipLabel.equalsIgnoreCase("in."))
                System.out.println(month[index] + "\t\t\t" +
                        numberFormat.format(temperature[index]) +
                        "\t\t\t\t" + numberFormat.format(precipitation[index]));
        }

        System.out.println("***************************************************");

        System.out.println("Average: " + numberFormat.format((totalTemp / 12)) + "\tTotal: " + totalPrecip);

    }
}
