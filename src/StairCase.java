package kitty;

public class StairCase {

	public static void main(String[] args) {
	  
		int no= 4;
		System.out.println(findstair(no));
	}
	
	public static int findstair(int n) {
		if(n==1 || n==0)
			return 1;
		else if (n==2) {
			 return 2;
			 
		}
		
		else {
			System.out.println("kittty");
			return findstair(n-3)+findstair(n-2)+findstair(n-1);// 1+2+1+1+2
		}
		
	}
	
}
