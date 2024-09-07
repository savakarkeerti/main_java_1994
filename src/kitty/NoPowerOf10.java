package kitty;

public class NoPowerOf10 {

	public static void main(String[] args) {
		System.out.println(powerOfTwoGeneral(1000000));

	}

	public static boolean powerOfTwoGeneral(int n) {
		while (n % 10 == 0) {
			n = n / 10;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}

}
