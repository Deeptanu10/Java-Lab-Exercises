package lab3;

//Create a method to accept date and print the duration in days, months and years 

import java.util.*;
import java.time.LocalDate;
import java.time.Month;

public class Exercise9 {

	public static void getDayMonthYear(String Date){
		 
        LocalDate currentDate = LocalDate.parse(Date);
 
        int day = currentDate.getDayOfMonth();
 
        Month month = currentDate.getMonth();
 
        int year = currentDate.getYear();
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

	
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in yyyy-mm-dd:-");
        String Date= sc.next();
        getDayMonthYear(Date);
        sc.close();
		
	}
}
