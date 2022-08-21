package lab5;

//Validate the age of a person and display proper message by using user defined exception.
//Age of a person should be above 15.

import java.util.*;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of the person: ");
		int age = sc.nextInt();
		try {
			if(age <= 15 )
				throw new InvalidAgeException("Age should be greater than 15");
			else
				System.out.println("Age of the person is: "+age);
		} 
		catch (InvalidAgeException e) {
			System.out.println(e);
		}
	
	}

}



