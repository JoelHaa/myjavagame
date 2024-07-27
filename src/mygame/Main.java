package mygame;
import java.util.Scanner;

public class Main {
	
	// Game variables
	static boolean gameIsActive = true;

	public static void main(String[] args) {
		System.out.println("Hello, and welcome to my game!");
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name?: ");
		Player player = new Player(scan.nextLine());
		
		while(gameIsActive) {
			System.out.print("Enter input: ");
			String userInput = scan.nextLine();
			if(userInput.equals("help")) {
				System.out.println("Available commands: 'help', 'stats', 'map', movement: 'n' 's' 'w' 'e'");
			}
			else if(userInput.equals("stats")) {
				System.out.println(player.getPlayerStats());
			}
			else if(userInput.equals("map")) {
				System.out.println(player.getPlayerPosition());
			}
			else if(userInput.equals("n")) {
				player.move(userInput);
			}
			else if(userInput.equals("w")) {
				player.move(userInput);
			}
			else if(userInput.equals("e")) {
				player.move(userInput);
			}
			else if(userInput.equals("s")) {
				player.move(userInput);
			}
			
			else {
				System.out.println("Invalid input");
			}
		}

	}

}
