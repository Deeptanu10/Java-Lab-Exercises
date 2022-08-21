package lab3;

//Create a method that accepts a String and checks if it is a positive string.
import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	    static boolean isAlphabaticOrder(String s){
	    	int n = s.length();
	    	char c[] = new char [n];
	    	for (int i = 0; i < n; i++) {
	            c[i] = s.charAt(i);
	        }
	    	Arrays.sort(c);
	    	for (int i = 0; i < n; i++)
	            if (c[i] != s.charAt(i)) 
	                return false;
	               
	        return true;    
	    }
	     
	    public static void main(String args[]){
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String");
	        String str = sc.next();
	        if (isAlphabaticOrder(str))
	           System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
}
