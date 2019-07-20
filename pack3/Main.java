package pack3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List<Player> players;
	
	public static Player PlayerEntry (String data){
		
		String a[] = data.split(",");
		int type = Integer.parseInt(a[3].trim());
		
		PlayerType ptype=null;
		List<PlayerType>typelist = PlayerType.preFillType();
		for(PlayerType playertype:typelist) {
			if (playertype.getId()==type) {
				ptype=playertype;
				break;
			}
		}
		
		Player player = new Player(a[0], a[1], a[2], ptype);
		return player;
    } 
    
	public static List<Player> printPlayersFromCountry(String country){
    		List<Player> slist = new ArrayList<Player>();
    		for(Player s:players) {
    			if(s.getCountry().equals(country))
    				slist.add(s);
    		}
    		return slist;
    	}
    	 
     
     public static List<Player> printPlayersFromTeam(String team){
    		List<Player> slist = new ArrayList<Player>();
    		for(Player s:players) {
    			if(s.getTeam().equals(team))
    				slist.add(s);
    		}
    		return slist;
    	}
	 
	 
	public static void main(String[] args) {
		players = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter player details ");
		for(int i=1;i<=n; i++) {
			String data = sc.nextLine();
			Player player = PlayerEntry(data);
			players.add(player);
		}
		while(true) {
		System.out.println("Menu \n1. Find players based on country\n2. Find players from team");
		System.out.println("Enter choice");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch==1) {
			System.out.println("Enter country ");
			String country= sc.nextLine();
			List<Player> plist =  printPlayersFromCountry(country);
			if(plist.size()==0)
				System.out.println("No player playing from "+country);
			else {
			System.out.println("Players from "+country+": ");
			//1. Shikhar Dhawan-SH 
			int i=1;
			for(Player p:plist) {
				String team = p.getTeam();
				String s="";
				for( String d:team.split(" "))
					s=s+d.charAt(0);
				
				System.out.printf("%d. %s-%s\n",i,p.getPlayerName(),s);
				i++;
			}
		  }
			
		}
		else if(ch==2) {
			System.out.println("Enter team ");
			String team =sc.nextLine();
			List<Player> plist = printPlayersFromTeam(team);
			if(plist.size()==0)
				System.out.println("No data available");
			else {
				System.out.println("Players playing for "+team+": ");
				int i=1;
				//1. Jos Buttler, England 
				for(Player p:plist) {
					System.out.printf("%d. %s, %s\n",i,p.getPlayerName(),p.getCountry());
					i++;
				}
			}
		}
		else {
			System.out.println("Thank you ");
		    break;
		}
			
		} // end of while loop
		


	}

}
