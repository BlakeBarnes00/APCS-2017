package mod5.Assignments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * This program will randomly generate a number that will dictate if the squirrel has been sighted.
 * Once the thing is finally spotted the counter will reset.
 *
 * @author Ellis Barnes
 * @version 11/25/17
 */

public class AnimalPopulation {
    public static void main(String[] args) throws IOException {

        // THIS AREA IS FOR PRINTING TO FILE (Would be better as a function/method)
        PrintWriter file = new PrintWriter(new File("SquirrelData.txt"));
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Amount of trials: ");
        int trials = in.nextInt();


        for(int test = 1; test <= trials; test++) {
            int count = 0; // Local variable to count the amount of times until spotting
            while (true) {
                count++;
                int squirrel = rand.nextInt(9);

                if (squirrel == 0) {
                    file.println("Fox Squirrel " + count);
                    break; // Break the loop if the squirrel is found
                }
                else if (squirrel >= 1 && squirrel <= 5)
                    file.println("Gray Squirrel");
                else if (squirrel > 5 && squirrel <= 10)
                    file.println("Red Squirrel");
            }
        }

        file.close(); // Close file once done
        // END PRINTING

        // THIS AREA IS FOR READING FROM FILE
        Scanner inFile = new Scanner(new File("SquirrelData.txt"));

        int total = 0;

        while(inFile.hasNext()) {
            String str = inFile.next();
            try {
                total += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                continue; // ignore any exception and keep progresssing
            }
        }
        System.out.println("Average: " + (total / trials));
    }
}
