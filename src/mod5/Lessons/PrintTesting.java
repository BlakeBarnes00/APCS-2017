package mod5.Lessons;

public class PrintTesting {
    public static void main(String[] args) {
        for (int row = 0; row <= 9; row++) {
            for (int col = 0; col <= 30; col++) {
                System.out.print("| " + row + "x" + col);
            }
            System.out.println(" |");
        }
    }
}
