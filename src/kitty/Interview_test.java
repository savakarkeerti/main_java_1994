package test;

import java.util.*;

public class Interview_test {

	public static void main(String[] args) {
		
      
		String str="Iam an Automation Engineer";
		
		String str1 []=str.split("\\s+");
		System.out.println(str1[str1.length-1]);
		
				
		/////////////////////////////////////////////////////////////
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		
		String word= str1[str1.length-1];
		for(int i=0; i<word.length();i++) {
		if(map.containsKey(word.charAt(i))) {
			map.put(word.charAt(i),map.get(word.charAt(i))+1 );
			
		}
		else {
			map.put(word.charAt(i),1);
		}
		}
		for(Map.Entry<Character,Integer> map1 : map.entrySet()) {
			System.out.println( " Keys = "+ map1.getKey()
			+" Values = "+ map1.getValue());
				
			
			
		}
		
	}

}
