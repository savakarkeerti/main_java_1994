package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_Inter {

	public static void main(String[] args) {
		
		int arr[]= {8,1,5,7,5,6};
		int arr1[]= {8,1,1,3,4,7};
		Set<Integer> set= new HashSet<Integer>();
		Set<Integer> set1= new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
			set1.add(arr1[i]);
		}
		System.out.println(set);
		set.retainAll(set1);
		System.out.println(set.contains(arr1[0]));
		System.out.println(set);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//////////////////////////////////////// Arrays rotation //////////////////
	
	

}
