package kitty;

import java.util.*;

public class DupicateChar {
	public static void main(String[] args) {
		String str = "Keerti12345keerti";
		StringBuffer num = new StringBuffer();
		StringBuffer let = new StringBuffer();
		int sum = 0;
		String nondup = "";
		String dup = "";

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				let.append(str.charAt(i));
			} else if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
				sum = sum + Integer.parseInt(str.charAt(i) + "");
			}

		}
		System.out.println(sum);
		System.out.println(let);
		String let1 = (let + "").toUpperCase();
		for (int i = 0; i < let.length(); i++) {
			if (!map1.containsKey(let1.charAt(i))) {
				map1.put(let1.charAt(i), 1);

				nondup = nondup + let1.charAt(i);
			} else {
				dup = dup + let1.charAt(i);
			}
		}
		System.out.println(nondup + " nondup----------------");
		System.out.println(dup + " dup----------------");
		
		//////////////////////////////////////////////////////////// ADDING 
		String num1= num.toString();
		int n= Integer.parseInt(num1);
         sum=0;
        
        while(!(n%10==0)){
            sum=sum+(n%10);
             System.out.println(n/10 +" quest");
             System.out.println(n%10+" remider");
            n=(n/10);
            
        }
        System.out.println(sum);
	}

}
