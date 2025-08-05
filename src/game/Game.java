package game;

import java.util.Scanner;

public class Game 
{
    private Player player;
    private Scanner scanner;

    public Game() 
    {
        player = new Player();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome To The Text Adventure Game!\n");

        boolean playing = true;
        while (playing) {
            System.out.println("\nChoose your path:");
            System.out.println("1. Walk towards the town");
            System.out.println("2. Explore the enchanted forest");
            System.out.println("3. Enter the castle");
            System.out.println("4. End The Game");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    new Town(player, scanner).enter();
                    break;
                case 2:
                    new Forest(player, scanner).enter();
                    break;
                case 3:
                    new Castle(player, scanner).enter();
                    break;
                case 4:
                	playing = false;
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.");
            }

            if (player.getHealth() <= 0) {
                System.out.println("\nYou have died. Game Over!");
                playing = false;
            }
        }

        endGame();
    }
    
    public void endGame() 
    {
        System.out.println("\nGame Over!");
        System.out.println("Your Health: " + player.getHealth());
        System.out.println("Your Score: " + player.getScore());
    }
}
