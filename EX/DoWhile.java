import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args) {
        boolean oshi = true;
        do {
            System.out.print("Is Ceres Fauna your oshi? Type '1' if yes, type '2' if no: ");
            try (Scanner input = new Scanner(System.in)) {
                int choice = input.nextInt();
                if (choice == 2) {
                    oshi = false;
                }
            }
        } while (oshi == true);
    }
}
