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
            //System.out.println(formatter.format(a));
        }

        ArrayList<ArrayList> list = new ArrayList<>();
        //ArrayList[] list = {year, pressure, speed, month, name};
        list.add(year);
        list.add(pressure);
        list.add(speed);
        list.add(month);
        list.add(name);
        print(list);
    }

    static void print(ArrayList l) {
        System.out.print("Time frame(years): ");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();

        System.out.println("\t\t\t\t\t\tHurricanes " + min + " - " + max);
        System.out.println("Year\tHurricane\t\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("=====================================================================");

    }
}
