package mod1.Assignments;

public class StudentInfoCard {
    public static void main(String[] args) {
        printBanner();
        System.out.println("Name: Ellis Barnes\t Birthday: January 3, 2000");
        System.out.println("Goes By: Ellis\t\t Age: 17\t\t Grade: 12");
        System.out.println("\nSchool: Lake Minneola High School\t City: Minneola, FL");
        System.out.println("\nCell Phone: 407-580-6189, available pretty much all the time.");
        System.out.println("Email: ellisbarnes00@gmail.com");
        System.out.println("I am taking APCS because Computer Science and programming is my passion. I am very interested" +
                "in learning how to develop and maintain long term projects to put on my portfolio one day to work" +
                "at a very well maintained company or startup. In my free time I already program as it is, so taking the " +
                "class seemed very well suited for me to do.");
    }

    public static void printBanner() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*\t\t\t\t\tStudent Information\t\t\t\t\t*");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
}
