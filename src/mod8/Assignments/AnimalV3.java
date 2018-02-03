package mod8.Assignments;

/**
 * The purpose of this is to show the way to use and create functions
 * for classes.
 * @author ellis
 * @version 02/02/18
 */
public class AnimalV3 {
    private double height, weight;

    public AnimalV3() {
        this.height = 0;
        this.weight = 0;
    }

    public AnimalV3(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Convert centimeters to inches
    public double getHeight() {
        return this.height * 0.393701;
    }

    // Convert kilograms to pounds
    public double getWeight() {
        return this.weight * 2.20462;
    }

    public static void main(String[] args) {
        AnimalV3 dog = new AnimalV3(28.3, 32.97);
        System.out.printf("Height: %3.2f inches. %n", dog.getHeight());
        System.out.printf("Weight: %3.2f pounds. %n", dog.getWeight());
    }
}
