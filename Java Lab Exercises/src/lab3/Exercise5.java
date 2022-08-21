package lab3;

//Write a Java program that displays the number of characters, lines and words in a text

import java.util.Scanner;

public class Exercise5 {
	static int wordcount(String str) { 
  
      int count = 1;
      for (int i = 0; i < str.length() - 1; i++) {
          if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
              count++;
      }
          return count;
    } 
	static int charactercount(String str) {
		int count=0; 
		for(int i=0;i<str.length();i++) { 
			char ch = str.charAt(i);
			if(ch!=' ')  
				count++; 
		}
		return count;
	}
	
		public static void main(String[] args) {  
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string:");
	        String str = sc.next();
	        System.out.println(charactercount(str) + " characters.");
	        System.out.println(wordcount(str) + " words.");
  }  
}  
