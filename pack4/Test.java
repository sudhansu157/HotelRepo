package asas;

public class Test {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {20,30,40};
		int t = distinct(a,b);
		System.out.println(t);

	}
	
	public static int distinct(int a[], int b[]) {
		int res=0;
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false)
				res++;
		}
		for(int i=0;i<b.length;i++) {
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false)
				res++;
		}
		return res;
		
	}

}
