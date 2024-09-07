package kitty;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Sorting {
	
	public static void main(String[] args) {
		
		String string = "Big black bug bit a big black dog on his big black nose";
		string =string.toUpperCase();
		String[] chr = string.split(" ");
		  
		  int size= chr.length;
		  LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		  for(int i=0;i<=size-1;i++) {
			  
			  if(map.containsKey(chr[i])) {
				  map.put(chr[i], map.get(chr[i])+1);
			  }
			  else {
				  map.put(chr[i], 1);
			  }
		  }
		
		  System.out.println(map.toString());
	}

}
