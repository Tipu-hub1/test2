package automation;

import java.util.Scanner;

public class Scannerwithifelse {

	public static void main(String[] args) {
int number = 0;
		

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Enter a number");
		

		 number= scan.nextInt();
		 

		 scan.close();
		 

		 if (number ==1) {
			 

			 System.out.println("One");
		 }

		 

		 else if (number ==2) {
			 

			 System.out.println("Two");
		 }


		 else if (number ==3) {
	 

	 System.out.println("Three");
}


		 else if (number ==4) {
	 

	 System.out.println("Four");
}


		 else if (number ==5) {
	 

	 System.out.println("Five");
}

		 else {
			 

			 System.out.println("Invalid number");
		 }
		 

	}

}
