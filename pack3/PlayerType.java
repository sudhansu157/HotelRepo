package pack3;
import java.util.ArrayList;
import java.util.List;

public class PlayerType {

	private int id; 
	private String  specialization ;
	
	public PlayerType(int id, String specialization) {
		super();
		this.id = id;
		this.specialization = specialization;
	}

	public PlayerType() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public static List<PlayerType> preFillType(){
		List<PlayerType> typeList=new ArrayList<PlayerType>();
		typeList.add(new PlayerType(1,"Bowler"));
		typeList.add(new PlayerType(2,"Batsman"));
		typeList.add(new PlayerType(3,"All Rounder"));
		typeList.add(new PlayerType(4,"Wicket Keeper"));
		return typeList;
	}

}
