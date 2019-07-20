package pack3;

public class Player {

	private String playerName ;
	private String country ;
	private String team ;
	private PlayerType playerType;
	
	
	public Player(String playerName, String country, String team, PlayerType playerType) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.team = team;
		this.playerType = playerType;
	}


	public Player() {
		super();
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public PlayerType getPlayerType() {
		return playerType;
	}


	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}
	
	
}
