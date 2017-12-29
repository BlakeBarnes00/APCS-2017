package mod6.Assignments.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ellis Barnes
 * @version 12/29/2017
 * This program sorts out all the data into different arrays so that we can easily read them
 */

public class HurricaneChallenge {
    public static void main(String[] args) {
        ArrayList<Integer> year     = new ArrayList<>();
        ArrayList<Integer> pressure = new ArrayList<>();
        ArrayList<Integer> speed    = new ArrayList<>();
        ArrayList<Double> speedMPH  = new ArrayList<>();
        ArrayList<String> month     = new ArrayList<>();
        ArrayList<String> name      = new ArrayList<>();

        File file = new File("hurricanedata.txt");

        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                year.add(sc.nextInt());
                month.add(sc.next());
                pressure.add(sc.nextInt());
                speed.add(sc.nextInt());
                name.add(sc.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Convert knots to MPH
        for(int a : speed) {
            speedMPH.add(a * 1.15078);
        }

        DecimalFormat formatter = new DecimalFormat("#.000");
        for(double a : speedMPH) {
            System.out.println(formatter.format(a));
        }
    }
}
