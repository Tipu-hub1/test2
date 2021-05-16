package automation;

import java.util.Scanner;

public class Scannermethod {

	public static void main(String[] args) {
	Scanner myobj = new Scanner(System.in); // creating a scanner object 

	System.out.println("Enter Your Name");
	
	
	String username = myobj.nextLine(); // Read user input
	System.out.println("Username is: " + username); // output user input
	
	}

}
