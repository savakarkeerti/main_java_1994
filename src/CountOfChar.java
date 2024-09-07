package kitty;

import java.util.HashMap;
import java.util.Map;

public class CountOfChar {

	public static void main(String[] args) {
		System.out.println(encode("aabbah"));
		
	}
	
	public static String encode(String str) {
		
		String kit="";
		HashMap <Character, Integer> hmap= new HashMap<Character,Integer>();
		
		char[] chrs=str.toCharArray();
		
		for(char c:chrs) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		
		for(Map.Entry entry:hmap.entrySet()) {
		 kit=kit+entry.getKey() +""+ entry.getValue();
			
		}
		return kit;
		
	}
}
