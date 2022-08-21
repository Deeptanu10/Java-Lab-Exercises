package lab3;

//Create a method that accepts a number and modifies it such that each of the digit 
//in the newly formed number is equal to the difference between two consecutive digits 
//in the original number. The digit in the units place can be left as it is. 

import java.util.Scanner;

public class Exercise4 {
	static void modifyNumber(int n) {
		String str = Integer.toString(n);
		StringBuffer st = new StringBuffer();
		int lastdigit=0;
			for (int i=0;i<str.length()-1;i++){
				char c = str.charAt(i);
				char d = str.charAt(i+1);
				int a = Integer.parseInt(String.valueOf(c));
				int b = Integer.parseInt(String.valueOf(d));
				int difference=Math.abs(a-b);
				String string = String.valueOf(difference);
				st.append(difference);
			}
			char d = str.charAt(str.length()-1);
			lastdigit = Integer.parseInt(String.valueOf(d));
		 st.append(lastdigit);
		 String s = st.toString();
		 int e = (Integer.valueOf(s));
		 System.out.println(e);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		modifyNumber(n);
	}

}

