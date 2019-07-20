package pack1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Hotel {
	
	private String registrationNo;
	private Date registrationDate;
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Hotel(String registrationNo, Date registrationDate) {
		super();
		this.registrationNo = registrationNo;
		this.registrationDate = registrationDate;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean validateRegistrationNumber(String registrationNo) {
		
		boolean flag=Pattern.matches("^[A-Z]{3}-[0-9]{2}-([A-Z]{2})-[0-9]{3}$",registrationNo);
		return flag;


		
	}
	
	
	
public static boolean convertRegistrationNumber(String registrationNo) {
		
	
	
	
	boolean flag=Pattern.matches("^[A-Za-z]{3}#[0-9]{2}#[A-Za-z]{2}#[0-9]{3}$",registrationNo);
	return flag; 

		
	}
	
	public static boolean  validateRegistrationDate(String registrationDate) throws Exception {
		boolean flag;
		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		   Date d=new Date();
		   Date d1=sdf.parse(registrationDate);
		 @SuppressWarnings("deprecation")
		int diff=d.getYear()-d1.getYear();
		 if(diff>10) {
			 flag=true;
		 }
		 else {
			 flag=false;
		 }
		return flag;
		
		
	
		
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Menu\n 1.Validate registration number\n2.Convert hotel registration number\n3.Has registration expired");
       String ch=sc.nextLine();
       int ch1=Integer.parseInt(ch);
       String regid = sc.nextLine();
       if(ch1==1) {
    	   if(validateRegistrationNumber(regid)) {
    		   
    		   System.out.println("valid registration number");
    	   }
    	   else {
    		   System.out.println("invalid registration number");
    	   }
    	   }
       if(ch1==2) {
    	   if( convertRegistrationNumber(regid)) {
    		String x = regid.replace('#','-');
			System.out.println(x.toUpperCase());
    	   }
    	   else {
    		   System.out.println("Not Match");
    	   }
    	   }
       if(ch1==3) {
    	   SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		   Date d=new Date();
		   Date d1=sdf.parse(regid);
		 @SuppressWarnings("deprecation")
		int diff=d.getYear()-d1.getYear();
    	   if(validateRegistrationDate(regid)) {
    		  
    		 
    			 System.out.print("Registration was done "+diff+" years before.Renew");
    		 
    		 
       }
    	   
    	   
    	   else {
  			 System.out.print("Registration was done"+diff+"years before.Continiue");
  		 }
}
}
}