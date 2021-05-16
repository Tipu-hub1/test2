package automation;

public class Loops_part_2 {

	public static void main(String[] args) {
		/*
		int i = 1; 
		

		System.out.println(i);
		System.out.println(++i); // every time they change the value of i.
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);

		

		

		System.out.println(i);
		System.out.println(++i);
		

		

		

		

		int x = 5; 
		

		//System.out.println(x + x++); // it will print 10, because it will not take ++ now. It will take x+x
		System.out.println(x + ++x); // it will print 11, because it will implement ++ first which is 1  then  print x also. so it will print (5+1+5) 
		System.out.println(x);
		

		

		

		

		

		float result = 0.0f;
		int sum = 0;
		

		int k = 1;
		

		do
		{
			sum = sum+k;
			System.out.println("Sum is  "+ sum);
			k++;
			

		}
		

		while (k<=50); // if not equal then k value is 50.
		

		System.out.println("The value of final k :" +k);
		//System.out.println(sum);
		

		result = (float)sum/(k-1);
		System.out.println(result);
		

		

		// Fibonacci number, --- 0, 1, 1, 2, 3,(P2) 5,(P1) 8(Current)  
		// Curr = P+P2;
		//
		

		int p2 = 1;
		int p1 = 1;
		

		int curr = 0;
		

		System.out.print(p1+ ", " + p2 + ", ");
		

		

		for (int i = 0; i<=25; i++) {
			

			curr = p1 + p2;
			

			p2 = p1;
			p1 = curr;
			

			System.out.print(curr+ ", ");
			

		}
		
 System.out.println("---------");
		
		char c;
		for ( c ='A'; c <='Z'; c++) {
			System.out.print(c + "  ");
			
		}
*/
		
// or 
		
		String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char [] alphabet = character.toCharArray();
		
		System.out.println(alphabet.length);
		
		for (char m = 0; m< alphabet.length; m++) {
			System.out.print(alphabet[m]+ " ");
		}
		
		System.out.println();
		
		for (char mychar : alphabet) {
			System.out.print(mychar + " ");
		}
	}

}
