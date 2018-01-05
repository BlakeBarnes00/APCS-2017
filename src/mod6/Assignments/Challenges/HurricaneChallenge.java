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
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> year = new ArrayList<>();
        ArrayList<Integer> pressure = new ArrayList<>();
        ArrayList<Integer> speed = new ArrayList<>();
        ArrayList<Double> speedMPH = new ArrayList<>();
        ArrayList<String> month = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> category = new ArrayList<>();

        File file = new File("hurricanedata.txt");

        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            year.add(sc.nextInt());
            month.add(sc.next());
            pressure.add(sc.nextInt());
            speed.add(sc.nextInt());
            name.add(sc.next());
        }

        // Convert knots to MPH
        for (int a : speed) {
            speedMPH.add(a * 1.15078);
        }

        for (double s : speedMPH) {
            if (s >= 74 && s <= 95)
                category.add(1);
            else if (s >= 96 && s <= 110)
                category.add(2);
            else if (s >= 111 && s <= 129)
                category.add(3);
            else if (s >= 130 && s <= 156)
                category.add(4);
            else if (s >= 157)
                category.add(5);
        }

        ArrayList<String> formattedData = format(year, pressure, speedMPH, name, category);
        print(formattedData, category, pressure, speedMPH);
    }

    static void print(ArrayList<String> l, ArrayList<Integer> category, ArrayList<Integer> pressure, ArrayList<Double> mph) {
        System.out.print("Time frame(years): ");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();

        System.out.println("\t\t\t\t\t\tHurricanes " + min + " - " + max);
        System.out.println("Year\tHurricane\t\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("=====================================================================");

        for (String a : l) {
            if (Integer.parseInt(a.substring(0, 4)) >= min && Integer.parseInt(a.substring(0, 4)) <= max)
                System.out.println(a);
        }

        System.out.println("=====================================================================");

        ArrayList<Double> averages = new ArrayList<>();
        DecimalFormat format = new DecimalFormat("#.00");
        double catavg = 0, pressavg = 0, windspeed = 0;
        for (int i = 0; i < category.size(); i++) {
            catavg      += category.get(i).doubleValue();
            pressavg    += pressure.get(i).doubleValue();
            windspeed   += mph.get(i).doubleValue();
        }
        averages.add(catavg / category.size());
        averages.add(pressavg / pressure.size());
        averages.add(windspeed / mph.size());

        System.out.println("Average:\t\t\t\t" + format.format(averages.get(0)) + "\t\t\t" + format.format(averages.get(1)) + "\t\t\t\t" + format.format(averages.get(2)));
    }

    static ArrayList<String> format(ArrayList<Integer> year, ArrayList<Integer> pressure, ArrayList<Double> mph, ArrayList<String> name, ArrayList<Integer> category) {
        ArrayList<String> s = new ArrayList<>();
        DecimalFormat format = new DecimalFormat("#.00");

        for (int i = 0; i < year.size(); i++) {
            s.add(year.get(i) + "\t" + name.get(i) + "\t\t\t\t" + category.get(i) + "\t\t\t" + pressure.get(i) + "\t\t\t\t" + format.format(mph.get(i)));
        }
        return s;
    }
}
