package mod6.Assignments.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ellis Barnes
 * @version 12/29/2017
 * This program sorts out all the data into different arrays so that we can easily read them
 */

public class HurricaneChallenge {
    public static void main(String[] args) {
        int[] year = {};
        int[] pressure = {};
        int[] speeds = {};
        String[] month = {};
        String[] name = {};

        File file = new File("hurricanedata.txt");

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
