package kitty;

import java.util.HashMap;
import java.util.Map;

public class CountofCycle {

	public static int countLengthOfCycle(int[] arr, int startIndex) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int count = 1;
		int index = startIndex;
		while (!m.containsKey(index)) {
			if (arr[index] > arr.length)// 1
				return -1;
			m.put(index, count);// 0,1; 1,2; 2,0
			count++; //2,3,4
			index = arr[index]; // arr[0]=> 1e,arr[1]=>2
			
		}
		return count - m.get(index);// 4-1
	}

	
	
	public static void main(String[] args) {

		boolean testsPassed = true;
System.out.println(countLengthOfCycle(new int[] { 1, 2, 0 }, 1));
		testsPassed &= countLengthOfCycle(new int[] { 1, 0 }, 0) == 2;
		testsPassed &= countLengthOfCycle(new int[] { 1, 2, 0 }, 0) == 3;

		if (testsPassed) {
			System.out.println("Test passed.");
			// return true;
		} else {
			System.out.println("Test failed.");
			// return false;
		}

	}

}
