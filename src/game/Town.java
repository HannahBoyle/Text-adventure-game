package game;

import java.util.Scanner;

public class Town {
    private Player player;
    private Scanner scanner;

    public Town(Player player, Scanner scanner) {
        this.player = player;
        this.scanner = scanner;
    }

    public void enter() {
        System.out.println("\nYou walk towards the town and notice a guard standing at the gates.");
        System.out.println("You ask if he will grant you entry into the town.");

        if (player.getScore() >= 16) {
            System.out.println("\nHe says: Welcome into the town, skilled adventurer.");
            Utils.pause(scanner);
            Utils.clearScreen();
            return;
        }

        // Player doesn't have enough score
        System.out.println("\nHe says: You are not a skilled enough adventurer. Come back when you have more score.");
        System.out.println("\nYou begin to walk away and hear a whisper beckoning you...");
        System.out.println("As you approach the voice, you see a green witch.");
        System.out.println("She says: Hello adventurer, I can give you more score.");
        System.out.println("She continues: I just need your blood in exchange — 1 score for 20 health.");
        System.out.println("1. Take her deal");
        System.out.println("2. Walk away");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            int count = 0;
            while (count < 5) {
                if (player.getHealth() <= 20) {
                    System.out.println("\nYou don't have enough health to continue the ritual.");
                    System.out.println("Returning to the main menu..");
                    Utils.pause(scanner);
                    Utils.clearScreen();
                    return;
                }

                System.out.println("\nYou shake hands with the witch, gaining 1 score.");
                player.addScore(1);
                player.reduceHealth(20);
                count++;

                System.out.println("Current Score: " + player.getScore());
                System.out.println("Current Health: " + player.getHealth());

                if (player.getScore() >= 16) {
                    System.out.println("\nYou return to the guard, now with enough score.");
                    System.out.println("He says: Welcome into the town, skilled adventurer.");
                    Utils.pause(scanner);
                    Utils.clearScreen();
                    return;
                }

                System.out.println("\nWould you like to do the ritual again?");
                System.out.println("1. Do it again");
                System.out.println("2. Leave");
                System.out.print("Enter your choice: ");
                int choice2 = scanner.nextInt();
                scanner.nextLine();

                if (choice2 != 1) {
                    System.out.println("\nYou are met immediately by a dead end and turn back.");
                    System.out.println("Returning to main menu...");
                    break;
                }
            }
        } else if (choice == 2) {
            System.out.println("\nYou decide to walk away from her deal.");
            System.out.println("Returning to main menu...");
        } else {
            System.out.println("\nInvalid choice. Game Over!");
        }

        Utils.pause(scanner);
        Utils.clearScreen();
    }
}
