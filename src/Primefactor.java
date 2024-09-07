package kitty;

import java.util.ArrayList;

public class Primefactor {

	public static void main(String[] args) {
		int n = 81;

		System.out.println(primeFactors(n));
	}

	public static ArrayList<Integer> primeFactors(int n)

	{
		ArrayList<Integer> fact = new ArrayList<Integer>();
		// Print the number of 2s that divide n
		while (n % 2 == 0) {

			n = n / 2;

			fact.add(2);
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// System.out.println(i+ "before loop");
			// While i divides n, print i and divide n
			while (n % i == 0) {
				// System.out.println(i);

				n = n / i;

				fact.add(i);
			}
			// System.out.println(n);
		}

		// This condition is to handle the case whien
		// n is a prime number greater than 2
		if (n > 2)
			fact.add(n);

		return fact;
	}

}
