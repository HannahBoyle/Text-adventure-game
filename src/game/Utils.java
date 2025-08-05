package game;
import java.util.Scanner;

public class Utils {
    public static void pause(Scanner scanner) {
        System.out.println("\nPress Enter to continue...");
        if (scanner.hasNextLine()) {
            scanner.nextLine(); 
        }
        scanner.nextLine(); 
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
