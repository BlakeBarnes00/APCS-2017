package mod4.Assignments;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name (First Last): ");
        String name = in.nextLine();

        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightString = in.next();

        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightString = in.next();

        // Parse the weight string to get the integer value
        int weight = Integer.parseInt(weightString);
        int height = Integer.parseInt(heightString);
        System.out.println(weight);
        System.out.println(height);

        // BMI Converted to Inches and Pounds
        double BMI = weight/(height*height);
        String BMIStatus = "";

        if(BMI <= 18.5)
            BMIStatus = "Underweight";
        else if (BMI >= 18.5 && BMI <= 24.9)
            BMIStatus = "Normal";
        else if (BMI >= 25.0 && BMI <= 29.9)
            BMIStatus = "Overweight";
        else if (BMI >= 29.9)
            BMIStatus = "Obese";

        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (In.): " + heightString);
        System.out.println("Weight (Lbs.): " + weight);
        System.out.println("BMI: " + BMI);
        System.out.println("Catagory: " + BMIStatus);

    }
}
