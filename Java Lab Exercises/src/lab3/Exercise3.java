package lab3;

//Create a method which accepts a String and 
//replaces all the consonants in the String with the next alphabet. 

import java.util.Scanner;

public class Exercise3 {
	static void consonant(String str) {
		String v="aeiouAEIOU ";
        String z="";
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(v.indexOf(c)==-1)
                    c++;
            z+=c;
        }
        System.out.println("Modified Sentence is "+z);
	}
	public static void main(String[] args) {
		Exercise3 ex = new Exercise3();
		Scanner in =new Scanner (System.in);
        System.out.println("Enter a String");
        String str=in.nextLine();
        ex.consonant(str);

	}

}

