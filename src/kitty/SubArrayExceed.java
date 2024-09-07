package kitty;

public class SubArrayExceed {

	public static void doTestsPass() {
		boolean result = true;
		int[] arr = { 1, 2, 3, 4 };
		//result = result && subArrayExceedsSum(arr, 6) == 2;
		result = result && subArrayExceedsSum(arr, 12) == -1;
		result = result && subArrayExceedsSum(arr, 10) == 4;
		result = result && subArrayExceedsSum(arr, 4) == 1;

		int[] arr2 = {};
		result = result && subArrayExceedsSum(arr2, 0) == 0;
		result = result && subArrayExceedsSum(arr2, 2) == -1;

		if (result) {
			System.out.println("All tests pass\n");
		} else {
			System.out.println("There are test failures\n");
		}

	};

	public static void main(String[] args) {
		
		doTestsPass();

	}

	public static int subArrayExceedsSum(int[] arr, int sum) {

		int n = arr.length;
		int minLen = n + 1;
		if (sum <= 0) {
			return 0;
		}
		if (n < 1) {
			return -1;
		}
		int allsum = 0;
		for (int start = 0; start < n; start++) {
			allsum += arr[start];
			int curSum = arr[start];
			if (curSum >= sum)
				return 1;

			for (int end = start + 1; end < n; end++) {
				curSum += arr[end];

				if (curSum >= sum && (end - start + 1) < minLen) {
					minLen = (end - start + 1);

				}
			}
		}
		if (allsum < sum) {
			return -1;
		}
		return minLen;
	}
}
