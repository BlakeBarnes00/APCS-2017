package mod8.Assignments;

/**
 * Animal class to show how to use classes to prevent remaking code over again.
 * @author ellis
 * @version 02/11/18
 */
public class AnimalV7 {
    private double height, weight;

    public AnimalV7() {
        this.height = 0;
        this.weight = 0;
    }

    public AnimalV7(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Setters
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

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
