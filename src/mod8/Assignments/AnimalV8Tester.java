package mod8.Assignments;

/**
 * Shows how to create an array of objects #5
 *
 * @author ellis
 * @version 02/11/18
 */
public class AnimalV8Tester {
    public static void main(String[] args) {
        AnimalV8[] animals = {
                new AnimalV8("Charlie", 30, 63),
                new AnimalV8("Freyja", 42, 96),
                new AnimalV8("Fred", 33, 62)
        };

        double[] weight = new double[animals.length];
        double[] height = new double[animals.length];

        System.out.printf("%-10s %5s %9s %n", "Animal", "Height", "Weight");
        System.out.println("---------------------------");
        for(int i = 0; i < animals.length; i++) {
            height[i] = animals[i].getHeight();
            weight[i] = animals[i].getWeight();

            System.out.printf("%-10s %5.2f %10.2f %n", animals[i].getName(), animals[i].getHeight(), animals[i].getWeight());
        }

        System.out.println("---------------------------");
        System.out.printf("%-10s %5.2f %10.2f %n", "Min.", findMinMax(height)[0], findMinMax(weight)[0]);
        System.out.printf("%-10s %5.2f %10.2f %n", "Max.", findMinMax(height)[1], findMinMax(weight)[1]);
        System.out.printf("%-10s %5.2f %10.2f %n", "Avg.", findAverage(height), findAverage(weight));
    }

    static double[] findMinMax(double[] values) {
        double max = values[0], min = values[0];
        double[] r = new double[2];

        for(int n = 0; n < values.length; n++)
        {

            if( values[n] < min)
                min = values[n];
            if(values[n] > max)
                max = values[n];
        }

        r[0] = min;
        r[1] = max;

        return r;
    }
    static double findAverage(double[] values) {
        double average = 0;

        for(double a : values) {
            average += a;
        }

        return average / values.length;
    }
}
