package lab1;

// Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;

public class Exercise1 {
	static void sumofCube(int n) {
		int cube;
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			cube=r*r*r;
			sum+=cube;
			n/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		sumofCube(n);
	}

}