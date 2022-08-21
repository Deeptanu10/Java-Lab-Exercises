package lab3;

//Create a class containing a method to create the mirror image of a String. 
//The method should return the two Strings separated with a pipe(|) symbol .

import java.util.Scanner;

public class Exercise2 {
	
	public String mirror(String str) {
		StringBuffer st = new StringBuffer(str);
        st.append('|');
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        st.append(s);
        return st.toString();
	}

	public static void main(String[] args) {
		Exercise2 ex = new Exercise2();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println(ex.mirror(str));
	}

}
