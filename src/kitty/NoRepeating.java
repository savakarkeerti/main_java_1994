package kitty;

import java.util.HashMap;
import java.util.Map;

public class NoRepeating {

	  public static void main(String[] args) {
	   String str ="abbddc" ;
	    System.out.println("first unique char in string "+str+"  is "+firstUnique(str));
	                       
	  }
	  
	 public static Character firstUnique(String str){
	  Map<Character, Integer> map = new HashMap<Character, Integer>();
	   int len = str.length();
	   
	   for(int i=0;i<len;i++){
	     char c= str.charAt(i);
	   
	     if(map.containsKey(c)){
	       map.put(c, map.get(c)+1);
	     }
	     else {
	     map.put(c,1);
	     }
	   }
	   
	   for(int i=0;i<len;i++) {
		   char c=str.charAt(i);
		   if(map.get(c)==1) {
			   return c;
		   }
			   
	   }
	   
	   return null;
	 
	 }

}
