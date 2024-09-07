package kitty;

import java.util.ArrayList;

public class Election {

	public static void main(String[] args) {

		int n = 4;
		int k = 2;
		System.out.println(joesh(n, k));
	}

	public static int joesh(int n, int k) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}

		return jorsh2(arr, 0, k - 1);// kth will be rejecting
	}

	private static int jorsh2(ArrayList<Integer> arr, int strt, int k) {

		if (arr.size() == 1) {

			return arr.get(0);
		}
		strt = (strt + k) % arr.size();
		System.out.println(strt + " index and element " + arr.get(strt));
		arr.remove(strt);

		return jorsh2(arr, strt, k);// 4 ele, 3 inde, 3
	}

}
