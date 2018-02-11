package mod8.Assignments;

/**
 * Animal class to show how to use classes to prevent remaking code over again.
 * @author ellis
 * @version 02/11/18
 */
public class AnimalV8 {
    private double height, weight;
    private String name;

    public AnimalV8() {
        this.height = 0;
        this.weight = 0;
        this.name = null;
    }

    public AnimalV8(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Setters
    public void setName(String name) { this.name = name; }
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

    public String getName() { return this.name; }
}
