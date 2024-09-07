package kitty;

import java.util.Arrays;
import java.util.LinkedHashMap;




public class Test {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7,8};
	
		
		for(int i=0;i<arr.length-2;i++) {
			
		if(arr[i+1]-arr[i]==1) {
			
			
		}
		else {
			int missing =arr[i]+1;
			System.out.println(" My missing number "+ missing);
			break;
		}
		}
	}
	
	
	

}
