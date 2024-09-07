package kitty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Anagram {
	public static void main(String[] args) {
		   List<String> list = Arrays.asList("cat","dog","god","tac","act");
		    System.out.println(anagram(list));
		                       
		  }
	public static String anagram(List<String> list1){
		
		 TreeSet<String> list= new TreeSet<String>(list1);
		 System.out.println(list+ " no duplicate");
		  String kit="";
		  Map<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		   
		   for(String s:list){
		     char [] charr = s.toCharArray();
		    // System.out.println(Arrays.toString(charr)+" kitty");
		    
		     Arrays.sort(charr);
		     String key = String.valueOf(charr);
		     
		     ArrayList<String> l=null;
		     if(map.containsKey(key)){
			     l= map.get(key);
			     l.add(s);
			     map.put(key,l);
			     
		     
		     }
		     else{
		    	  l=new ArrayList<String>();
			       l.add(s);
				     map.put(key,l);
			       //System.out.println(l+" null");
		      
		     }
		    
		   }
		  // System.out.println(map+" all arry");
		   for(Map.Entry entry :map.entrySet()) {
			  // System.out.println(entry.getKey()+ " all  keys");
			   ArrayList<String> a= (ArrayList<String>) (entry.getValue());
			   int len=a.size();
			   for(int i=0;i<len;i++) {
				   kit= kit +a.get(i)+" ";
			   }
		   }
		  
		   return kit;
		 }

}
