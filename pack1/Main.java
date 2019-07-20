import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String a[]=new String[5];
		String a1[]=new String[5];
		System.out.println("Hotel 1");
		System.out.println("id");
		a[0]=sc.nextLine();
		System.out.println("Name");
		 a[1]=sc.nextLine();
		 System.out.println("City");
		 a[2]=sc.nextLine();
		 System.out.println("Rating");
		 a[3]=sc.nextLine();
		 System.out.println("Since");
		 a[4]=sc.nextLine();
		System.out.println("Hotel 2");
		System.out.println("id");
		a1[0]=sc.nextLine();
		System.out.println("Name");
		 a1[1]=sc.nextLine();
		 System.out.println("City");
		 a1[2]=sc.nextLine();
		 System.out.println("Rating");
		 a1[3]=sc.nextLine();
		 System.out.println("Since");
		 a1[4]=sc.nextLine();
		 
		 Hotel h1=new Hotel(Long.parseLong(a[0]),a[1],a[2],Integer.parseInt(a[3]),sdf.parse(a[4]));
		 Hotel h2=new Hotel(Long.parseLong(a1[0]),a1[1],a1[2],Integer.parseInt(a1[3]),sdf.parse(a1[4]));
		System.out.println("Sample Output");
		System.out.println("Details of Hotel 1");
		System.out.println("Hotel"+a[1]+",City-"+a[2]+","+a[3]+"star rating");
		System.out.println("Details of Hotel 2");
		System.out.println("Hotel"+a1[1]+",City-"+a1[2]+","+a1[3]+"star rating");
		
		
		if(h1.equals(h2)){
			System.out.println("Another hotel of similar type exists");
		}
		else {
			System.out.println("One of its type");
		}
		
	}

}
