package mygame;

public class Player {
	int playerPosX;
	int playerPosY;
	String playerName;
	
	public Player(String name) {
		playerPosX = 0;
		playerPosY = 0;
		playerName = name;
	}
	
	public void move(String direction) {
		if(direction.equals("n")) {
			playerPosY+=1;
			System.out.println("You moved north.");
		}
		else if(direction.equals("s")) {
			playerPosY-=1;
			System.out.println("You moved south.");
		}
		else if(direction.equals("w")) {
			playerPosX-=1;
			System.out.println("You moved west.");
		}
		else if(direction.equals("e")) {
			playerPosX+=1;
			System.out.println("You moved east.");
		}
		else {
			System.out.println("Invalid command");
		}
	}
	
	public String getPlayerPosition() {
		return("(" + playerPosX + "," + playerPosY + ")");
	}

	public String getPlayerStats() {
		String playerStats = "--- Player Statistics ---\n" + 
							" Player name: " + playerName + "\n";
		return(playerStats);
	}
}
