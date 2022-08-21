package lab6;

//Create a method which accepts an array of numbers and 
//returns the numbers and their squares in Hashmap

import java.util.*;
import java.util.Map.Entry;

public class Exercise3 {
	
	static void getSquares(int [] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n: a) {
	      map.put( n, n*n);
	    }
		Set<Entry<Integer, Integer>>entries =map.entrySet();
		for(Entry<Integer, Integer> entry : entries)
			System.out.println(entry.getKey()+"\t"+"\t"+entry.getValue());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers");
		int[]a=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Numbers "+"\t"+"Squares");
		getSquares(a);
	}

}
