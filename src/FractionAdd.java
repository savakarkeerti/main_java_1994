package kitty;

import java.util.Arrays;

public class FractionAdd {

	public static void main(String[] args) {
		int[] f1 = { 2, 3 };
		int[] f2 = { 4, 3 };

		int res[] = addFraction(f1, f2);
		System.out.println(res[0] + "/" + res[1]);
	}

	public static int[] addFraction(int[] f1, int[] f2) {
		int[] res = new int[2];
		int num = f1[0] * f2[1] + f1[1] * f2[0];
		int den = f1[1] * f2[1];

		int gcd = gcd(num, den);

		res[0] = num / gcd;
		res[1] = den / gcd;

		return res;
	}

	public static int gcd(int num1, int num2) {
		//int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);

		int gcd = 1;

		for (int i = min; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return gcd;
	}
}
