package kitty;

import java.util.Arrays;

public class LongestUniformRepeatingstring {

	public static void main(String[] args) {
		String str = "aabbbcccdddd";
		System.out.println(Arrays.toString(findlongstring(str)));
		
	}

	public static int[] findlongstring(String s) {

		int longLength = 0;
		int longstrat = -1;
		int i = 1;
		int len = s.length();
     
		while (i < len) {

			int start = i - 1;
			int currentlenght = 1;
			while (i < len && s.charAt(i) == s.charAt(i - 1)) {
				i++;
				currentlenght++;
			}
			if (currentlenght > longLength) {
				longstrat = start;
				longLength = currentlenght;

			}
			i++;
		}
          //longLength=  longstrat+longLength;
		return new int[] { longstrat, longLength};
	}
}
