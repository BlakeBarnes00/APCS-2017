package mod8.Assignments;

/**
 * Tester class for AnimalV7.java
 *
 * @author ellis
 * @version 02/11/18
 */
public class AnimalV7Tester {
    public static void main(String[] args) {
        AnimalV7 dog = new AnimalV7();
        AnimalV7 cat = new AnimalV7(30, 63);

        dog.setHeight(42);
        dog.setWeight(96);

        System.out.printf("%s %20s %20s %n", "Animal", "Height", "Weight");
        System.out.printf("%s %22.2f %21.2f %n", "Dog", dog.getHeight(), dog.getWeight());
        System.out.printf("%s %22.2f %21.2f %n", "Cat", cat.getHeight(), cat.getWeight());
    }
}
