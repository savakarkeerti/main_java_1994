package kitty;

import java.util.Arrays;
import java.util.HashSet;

public class UnqiueTouple {

	public static HashSet<String> uniqueTuples(String input, int len) throws IllegalArgumentException {
		
		HashSet<String> resultSet = new HashSet<String>();
		int inputLength = 0;

		if (input == null) {
			throw new IllegalArgumentException("Input string cannot be null.");
		} else {
			inputLength = input.length();
		}

		if (inputLength == 0) {
			throw new IllegalArgumentException("Input string cannot be of zero length.");
		}

		if (len <= 0) {
			throw new IllegalArgumentException("Length of tuples has to be greater than zero.");
		}

		if (len > inputLength) {
			throw new IllegalArgumentException(
					"Length of the tuple cannot be more than the length of the input string.");
		}

		for (int i = 0; i < (inputLength - len + 1); i++) { // 3-2+1= 2// 5-2+1= 6
			resultSet.add(input.substring(i, (i + len)));
		}

		return resultSet;
	}

	public static void main(String[] args) {

		String input = "aab";
		String input1 = "abbccde";
		
		System.out.println(uniqueTuples(input, 2));
		System.out.println(uniqueTuples(input1, 2));
		
		HashSet<String> result = uniqueTuples(input, 2);
		HashSet<String> result1 = uniqueTuples(input1, 2);

		if ((result.contains("aa") && result.contains("ab"))
				&& (result1.containsAll(Arrays.asList("ab", "bb", "bc", "cc", "cd", "de")) && result1.size() == 6)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}

	}

}
