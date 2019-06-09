package src.bank;

//Dead Code; Ignore
public abstract class Player {
	

	private String playerName;
	//Sets player's Name
	public Player(String givenName) {
		this.playerName = givenName;
	}
	//Getter
	public String getPlayerName() {
		return playerName;
	}
	//Setter
	public void setPlayerName(String givenName) {
		playerName = givenName;
	}
	
}
