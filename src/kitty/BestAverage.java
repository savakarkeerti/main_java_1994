package kitty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestAverage {

	private static ArrayList<String> ArrayList(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean pass() throws Throwable {
		String[][] s1 = { { "Rohan", "84" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };

		return bestVag(s1) == 84;
	}

	public static void main(String[] args) {
		try {
			if (pass()) {
				System.out.println("Pass");
			} else {
				System.out.println("Some Fail");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int bestVag(String[][] s) {

		HashMap<String, ArrayList<Integer>> m = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < s.length; i++) {

			if (m.containsKey(s[i][0])) {
				ArrayList<Integer> a = m.get(s[i][0]);
				a.add(Integer.parseInt(s[i][1]));
				m.put(s[i][0], a);
			} else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(Integer.parseInt(s[i][1]));
				m.put(s[i][0], a);

			}
		}
		System.out.println(m + " kitty");
		int lenMap = m.size();
		int j = 0;
		int arrAvg[] = new int[lenMap];
		for (Map.Entry entry : m.entrySet()) {
			int add = 0;
			int subLen = 0;
			int avg = 0;
			ArrayList<Integer> list = (ArrayList<Integer>) (entry.getValue());
			subLen = list.size();
			for (int i = 0; i < subLen; i++) {
				add = add + list.get(i);

			}
			avg = add / subLen;
			arrAvg[j] = avg;
			j++;

		}
		Arrays.sort(arrAvg);

		return arrAvg[lenMap - 1];
	}
}
