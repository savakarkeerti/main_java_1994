package kitty;

import java.util.Arrays;

public class MedianArray {

	public static void main(String[] args) {
		
		int a[]= {1,3};
		int b[]= {2,4};
		int size1=a.length;
		int size2=b.length;
		int total=(size1+size2);
		int c[]= new int[(size1+size2)];
		int j=0;
		for(int i=0;i<a.length;i++ ) {
			c[i]=a[i];
			System.out.println(a[i]);
		}
		for(int i=a.length;i<total;i++) {
			
			
			System.out.println(b[j]);
			c[i]=b[j];
			j++;
			
		}
		
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.println(c.length+ " total lenght");
		if((total)%2==1) {
			System.out.println("kitty");
			int mid=((total)/2);
			System.out.println(c[mid]);
			
		}
		else if((total)%2==0){
			System.out.println("monkey");
			int mid1=total/2;
			System.out.println(c[mid1]+ " pari "+ c[mid1-1]);
			double med=((c[mid1-1]+c[mid1])/2.0);
			System.out.println(med);
			
		
		}
	}
}
