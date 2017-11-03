package mod5.Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FamilyStructure {
    public static void main(String[] args) {

        File file = new File("./docs/maleFemaleInFamily.txt");
        int totalFamilies = 0;

        // BB, GG, BG
        int[] totals = { 0, 0, 0};

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()) { // Check if the line has anything on it
                String current = sc.next();
                if(current.equals("BB"))
                    totals[0]++;
                else if(current.equals("GG"))
                    totals[1]++;
                else if(current.equals("BG") || current.equals("GB"))
                    totals[2]++;

                // If there is a line with two kids, then that is a family
                totalFamilies++;
            }

            // Print table
            System.out.println("Total number of families: " + totalFamilies);
            System.out.println("Number of families with");
            System.out.println("\t\t2 boys: \t\t" + totals[0] + "\trepresents " + ((double)totals[0] / totalFamilies) * 100 + "%");
            System.out.println("\t\t2 girls: \t\t" + totals[1] + "\trepresents " + ((double)totals[1] / totalFamilies) * 100 + "%");
            System.out.println("\t\t1 boy 1 girl: \t"+ totals[2] + "\trepresents " + ((double)totals[2] / totalFamilies) * 100 + "%");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
