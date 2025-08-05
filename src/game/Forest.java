package game;

import java.util.Scanner;

public class Forest 
{
    private Player player;
    private Scanner scanner;

    public Forest(Player player, Scanner scanner) 
    {
        this.player = player;
        this.scanner = scanner;
    }

    public void enter() 
    {
        System.out.println("\nYou enter an enchanted forest and are greated with a hedge maze.");
        System.out.println("1. Turn right");
        System.out.println("2. Turn left");
        System.out.print("Enter Your Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) 
        {
        	System.out.println("\nYou see a clear path forward and continue forward");
        	next();
        } 
        else if (choice == 2) 
        {
        	System.out.println("\nyou are met immediatley by a dead end so you turn around and head back down the left path");
        	System.out.println("You lose some score in the process");
        	player.reduceScore(5);
        	next();
        } 
        else 
        {
            System.out.println("\nInvalid Choice. Game Over!");
        }
    }
    
    public void next()
    {
    	System.out.println("\nAs you carry down the path, you hear a loud growl");
    	System.out.println("You approach another decision in the maze");
        System.out.println("1. Go forward");
        System.out.println("2. Turn left");
        System.out.print("Enter Your Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) 
        {
        	System.out.println("\nYou a sparkle at the end of the path");
        	System.out.println("You see a glittering gem and decide to pick it up");
        	System.out.println("You head out of the maze and feel yourself gaining score");
        	player.addScore(20);
        	System.out.println("Returning to main menu...");
        	
        	Utils.pause(scanner);
        	Utils.clearScreen();
        } 
        else if (choice == 2) 
        {
        	System.out.println("\nYou run down the left corridor, hearing the growling get louder");
        	cat();
        } 
        else 
        {
            System.out.println("\nInvalid Choice. Game Over!");
        }
    }
    
    public void cat()
    {
    	System.out.println("\nYou encounter a small looking cat at the end of the corridor, do you: ");
    	System.out.println("1. pet the cutie");
    	System.out.println("2. you find it aggressive so decide to attack");
    	System.out.print("Enter Your Choice: ");
    	int choice = scanner.nextInt();
    	scanner.nextLine();

        if (choice == 1) 
        {
        	System.out.println("\nThe cat hisses as you indicating it didnt want to be touched");
        	System.out.println("The cat got upset and clawed at you, then ran away back through the maze");
        	System.out.println("You got caught by its claw and you lose 10 health but grabbedits collar in the process");
        	System.out.println("You swiftly leave the maze clothing the collar, you gain score");
        	player.reduceHealth(10);
        	player.addScore(10);
        	System.out.println("Returning to main menu...");
        	
        	Utils.pause(scanner);
        	Utils.clearScreen();
        } 
        else if (choice == 2) 
        {
        	System.out.println("\nYou vicously stomp on the cats little head, it crys out in pain");
        	System.out.println("It turns in shock and runs away from you.");
        	System.out.println("You gain 15 score but have this bad haunting feeling");
        	System.out.println("you hear an array of small hisses and run out of the maze");
        	player.addScore(15);
        	System.out.println("Returning to main menu...");
        	
        	Utils.pause(scanner);
        	Utils.clearScreen();
        } 
        else 
        {
            System.out.println("\nInvalid Choice. Game Over!");
        }
    }
}
