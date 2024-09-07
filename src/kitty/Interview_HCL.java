package kitty;

import java.util.Scanner;

public class Interview_HCL {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc= new java.util.Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" After swapping");
		System.out.println(b+" After swapping");
		
	}
}
