package test;

//Java program to find GCD of two numbers 
class GCD { 
	// Gcd of x and y using recursive function 
	static int GCD_Hcf(int x, int y) 
	{ 
		// Everything is divisible by 0 
		if (x == 0) 
			return y; 
		if (y == 0) 
			return x; 

		// Both the numbers are equal 
		if (x == y) 
			return x; 

		// x is greater 
		if (x > y) 
			return GCD_Hcf(x - y, y); // 12, 24 - 2nd iter
		return GCD_Hcf(x, y - x); // 36, 24 - 1st iter
		                          // 12,12  - 3rd iter 
	} 

	// The Driver method 
	public static void main(String[] args) 
	{ 
		int x = 36, y = 60; 
		System.out.println("GCD of " + x + " and " + y 
						+ " is " + GCD_Hcf(x, y)); 
	} 
}

