package lab1;

// Write a java program that simulates a traffic light. 
//The program lets the user select one of three lights: 
//red, yellow, or green with radio buttons.
// On entering the choice,
// an appropriate message with “stop” or “ready” or “go” should appear in the console .
//Initially there is no message shown.

public class Exercise2{
	
	public String s;
	
	Exercise2(String s){
		this.s=s;
	}
	
	void Check() {
		if (s=="red") {
			System.out.println("Stop");
		}
		if (s=="yellow") {
			System.out.println("Ready");
		}
		if (s=="green") {
			System.out.println("Go");
		}
		
	}

	public static void main(String[] args) {
		Exercise2 S1 =new Exercise2("red");
		Exercise2 S2 =new Exercise2("yellow");
		Exercise2 S3 =new Exercise2("green");
		
		S1.Check();
		S2.Check();
	}

}