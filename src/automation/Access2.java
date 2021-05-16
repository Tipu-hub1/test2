package automation;

public class Access2 {

	public static void main(String[] args) {
	
		Access obj = new Access();
		System.out.println(obj.p);// public
		System.out.println(obj.name); // package private
		//System.out.println(obj.pr); cannot access as it is private
 // similarly methods as well....
		
		// create another package and then can access to package private....
	}

}
