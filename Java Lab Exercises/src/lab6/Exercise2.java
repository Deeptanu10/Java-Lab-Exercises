package lab6;

import java.util.*;
import java.util.Map.Entry;

//Create a method that accepts a character array and 
//count the number of times each character is present in the array.

public class Exercise2 {
	
	static void countChars(char [] a) {
		HashMap <Character,Integer> map = new HashMap<>();
		 for(char c:a){
			 if(map.containsKey(c)){
				 map.put(c,map.get(c) + 1);
	          }
			 else{
				 map.put(c,1);
			 }
		 }
		 Set<Entry<Character, Integer>>entries =map.entrySet();
		 for(Entry<Character, Integer> entry : entries)
			System.out.println(entry.getKey()+"\t"+"\t"+entry.getValue());
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter some characters");
		char[] a = s.next().toCharArray();
		System.out.println("Characters "+"\t"+"Occurences");
		countChars(a);
	}
}
