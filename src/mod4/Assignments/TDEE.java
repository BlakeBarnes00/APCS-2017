package mod4.Assignments;

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = in.next();

        System.out.print("Enter Gender (M/F): ");
        String gender = in.next();

        System.out.print("Your BMR: ");
        double BMR = in.nextDouble();

        System.out.println("Select Your Activity Level");
        String[] levels = {
                "[A] Resting (Sleeping, Reclining)", "[B] Sedentary (Minimal Movement)",
                "[C] Light (Sitting, Standing)", "[D] Moderate (Light Manual Labor, Dancing, Riding Bike)",
                "[E] Very Active (Team Sports, Hard Manual Labor)",
                "[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)"
        };

        for (int i = 0; i < levels.length; i++) {
            System.out.println(levels[i]);
        }

        System.out.print("Enter letter choice to Activity Level: ");
        String ActivityLevel = in.next();

        double ActivityFactor = 0, TDEE = 0;
        // Since there is not a difference in the first two genders, you don't need to use
        // logical operators
        if(ActivityLevel.equals("A")) {
            ActivityFactor = 1.0;
            TDEE = BMR * ActivityFactor;
        }
        else if(ActivityLevel.equals("B")) {
            ActivityFactor = 1.3;
            TDEE = BMR * ActivityFactor;
        }

        // Organize it this way so that there is no repeated code for fuck sakes.
        if(gender.equals("F")) {
            if(ActivityLevel.equals("C")) {
                ActivityFactor = 1.5;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("D")) {
                ActivityFactor = 1.6;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("E")) {
                ActivityFactor = 1.9;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("F")) {
                ActivityFactor = 2.2;
                TDEE = BMR * ActivityFactor;
            }
        }
        else if(gender.equals("M")) {
            if(ActivityLevel.equals("C")) {
                ActivityFactor = 1.6;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("D")) {
                ActivityFactor = 1.7;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("E")) {
                ActivityFactor = 2.1;
                TDEE = BMR * ActivityFactor;
            }
            else if(ActivityLevel.equals("F")) {
                ActivityFactor = 2.4;
                TDEE = BMR * ActivityFactor;
            }
        }

        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + BMR + " calories" + "\t\tActivity Factor: " + ActivityFactor);
        System.out.println("TDEE: " + TDEE);
    }
}
