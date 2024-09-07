package kitty;

import java.util.Scanner;

public class Programming9 {
	public static void main(String args[]){

		//Scanner is a class which read input from keyboard
		//System.out.println(findmis("The quick Brown fox jumps Over a Lazy Dog"));
		System.out.println(findmis(""));
	}
	
	public static String findmis(String str) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your String:");

		//to read string end of line
		//String str=sc.nextLine();

		// replaceALL()-->replaces all spaces between strings
		//toLowerCase()->method which converts all characters to lower case
		str=str.replaceAll("\\s","").toLowerCase();

		// empty string
		String s="";
String k="";
		// checking characters (a-z or A-Z)
		for(char i='a';i<='z';i++){

			//indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
			if(str.indexOf(i)!=-1){
  // returns index position for the given char value
				s=s+i;// empty string+character
			}
			
			else 
			{
				k=k+i;
			}
			
		}
		
		//System.out.println(s+ "  kitty");
		//System.out.println(k+" monkey");
		// s.length()-->this method returns number or character of a string
		if(s.length()==26){
			System.out.println("Pangram");
			return s;
		}
		else{
			System.out.println(" Not Pangram");
			return k;
		}
		
		
	}
}
