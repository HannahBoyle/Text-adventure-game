package game;

import java.util.Random;
import java.util.Scanner;

public class Castle {
    private Player player;
    private Scanner scanner;

    public Castle(Player player, Scanner scanner) {
        this.player = player;
        this.scanner = scanner;
    }

    public void enter() {
        System.out.println("\nYou walk up to the castle and hear an array of crunching noises");
        System.out.println("Do you investigate the crunching noise or run straight forward");
        System.out.println("1. Investigate");
        System.out.println("2. Leave it alone");
        System.out.print("Enter Your Choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) 
        {
            System.out.println("\nYou wander upon a giant hugely fat cat and the crunching is it eating");
            System.out.println("You notice something shimmering in its huge bag of food and you go towards it");
            System.out.println("Upon closer inspection you realise its a huge shiny ring, you attempt to take it");
            
            if (new Random().nextBoolean()) 
            {
              System.out.println("\nYou manage to grab the ring and sprint out of the castle disturbing the cat in the process");
              System.out.println("Luckily for you the cat is too fast to chase you, you gain score");
              player.addScore(20);
              System.out.println("Returning to main menu...");
          	
          	  Utils.pause(scanner);
          	  Utils.clearScreen();
            } 
            else 
            {
              System.out.println("\nThe cat catches you trying to take its ring thinking you are stealing its food");
              System.out.println("The cat is enraged and leaps at you swallowing you in one bite!");
              player.reduceHealth(100);
              System.out.println("Returning to main menu...");
          	
          	  Utils.pause(scanner);
          	  Utils.clearScreen();
            }
        } 
        else if (choice == 2) 
        {	
            System.out.println("\nYou decide to venture down the opposite hall from the noise");
            System.out.println("You come upon a throne room with a set of jewels beside the throne");
            System.out.println("However their is a group of kittens surounding them, you attempt to grab them");
            
            if (new Random().nextBoolean()) 
            {
              System.out.println("\nYou manage to grab the jewels without disturbing the kittens");
              System.out.println("you gain score");
              player.addScore(20);
              System.out.println("Returning to main menu...");
          	
          	  Utils.pause(scanner);
          	  Utils.clearScreen();
            } 
            else 
            {
              System.out.println("\nThe group of kittens start perking up their ears.. you've woken them");
              System.out.println("Cluthing to only the necklace you leap out hoping to dodge the kittens");
              System.out.println("The cats manage to scratch at your ankles as you jump away");
              System.out.println("You gain some score for the necklace but lose health in the process");
              player.reduceHealth(10);
              player.addScore(10);
              System.out.println("Returning to main menu...");
          	
          	  Utils.pause(scanner);
          	  Utils.clearScreen();
            }
        }
        else
        {
        	System.out.println("\nInvalid Choice. Game Over!");	
        }
 
    }
}
    
