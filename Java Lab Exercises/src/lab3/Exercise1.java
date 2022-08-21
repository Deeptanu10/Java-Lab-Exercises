package lab3;

//Write a Java program that reads a line of integers and
//then displays each integer and the sum of all integers. (Use String Tokenizer class)
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers by comma: ");
		String str = sc.next();
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
