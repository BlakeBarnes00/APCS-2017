package mod6.Assignments;

/**
 * Annual Weather description: Program that displays average
 * temperature and precipitation.
 * 
 * @author Ellis Barnes
 * @version 12/18/2017
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Vero Beach";
        String state = "Florida";
  
        String [] month = {
                "Jan.", "Feb.", "Mar.", "Apr.",
                "May.", "Jun.", "Jul.", "Aug.",
                "Sep.", "Oct.", "Nov.", "Dec."
        };

        double [] temperature = {
                63.0, 63.9, 67.7, 71.5,
                76.2, 80.4, 81.7, 81.6,
                80.7, 76.4, 70.5, 64.7
        };     //initialize with Fahrenheit values
        double [] precipitation = {
                2.9, 2.5, 4.2, 2.9,
                3.8, 6.0, 6.5, 6.0,
                6.87, 5.0, 3.0, 2.2
        };      //initialize with inch values
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
    

        double totalTemp = 0, totalPrecip = 0;
        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            totalTemp   += temperature[index];
            totalPrecip += precipitation[index];
        }
    
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();

        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.println(month[index] + "\t\t\t" + temperature[index] + "\t\t\t\t" + precipitation[index]);
        }
        System.out.println("***************************************************");

        System.out.println("Average: " + (totalTemp/12) + "\tTotal: " + totalPrecip);

    }//end main
}//end class
