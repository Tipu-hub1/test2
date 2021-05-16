package automation;

public class Array_2 {

	public static void main(String[] args) {
		
		// Array has to be same data type
				// Array has fixed in length
				// collection framework - we do have dynamic array there we can change the length of array

				

				

				// declare a array size 10, 
				// add 
				

				String [] student = new String [10];
				

				student[0] = "Naznin";
				student[1] = "Laboni";
				student[2] = "Subarna";
				student[4] = "Anjuman";
				student[5] = "Uma";
				student[6] = "Riyadh";
				student[7] = "Arafat";
				student[8] = "Musa";
				student[9] = "Farhana";
				

				System.out.println(student.length);
				//System.out.println(student[5]);
				

				student[3] = "Amreen";
				

				for (int i = 0; i<student.length; i++) {
					

					System.out.println("Name of the student is " +student[i]);
				}
				

	}

}
