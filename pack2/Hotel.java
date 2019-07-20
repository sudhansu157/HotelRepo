package pack2

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotel {
	
	private long id;
	private String name;
	private String city;
	private int rating;
	private Date estdDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getEstdDate() {
		return estdDate;
	}
	public void setEstdDate(Date estdDate) {
		this.estdDate = estdDate;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(long id, String name, String city, int rating, Date estdDate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.rating = rating;
		this.estdDate = estdDate;
	}

	public boolean equals(Hotel obj) {
	
		return (this.city.equalsIgnoreCase(obj.city)) && this.rating==(obj.rating);
	}
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	@Override
	public String toString() {
		return String.format("id"+id+"\nName:"+name+"\nCity"+city+"Rating:"+rating+"\nSince"+sdf.format(estdDate)+"\n");
	}
	
	
	
	
	
	

}
