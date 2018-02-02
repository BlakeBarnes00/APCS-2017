package Test;

/**
 *  This class is for testing and running random lines of code into it for exams
 */
public class Test {
    public static void main(String[] args) {
        double[] w1 = {43.1, 45.8, 48.6, 43.2, 41.9, 43.8, 45.7, 43.2, 42.8, 43.8};
        double[] w2 = new double[8]; //  this is for after removing the lowest and highest amounts from w1

        double min = getMinValue(w1), max = getMaxValue(w1);
        double average = 0;

        for (int i = 0; i < w2.length; i++) {
            if (w1[i] != min)
                w2[i] = w1[i];
            if(w1[i] != max)
                w2[i] = w1[i];

            if(i > w2.length)
                break;
        }

        for(double a : w2) {
            average += a;
            System.out.println(a);
        }

        System.out.println("Average: " + average/w2.length);
    }

    public static double getMaxValue(double[] array) {
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static double getMinValue(double[] array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
