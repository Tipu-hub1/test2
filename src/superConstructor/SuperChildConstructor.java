package superConstructor;

// if you have a parent constructor, the constructor must be called from child class. 
public class SuperChildConstructor extends SuperParentConstructor{ // you must pass your parent class constructor mandatory...

	int seccode; 
	
	SuperChildConstructor(String uname, String pwd, int seccode) {
		super(uname, pwd);	
		this.seccode =seccode;
	}

	public void printseccode() {
		System.out.println(" Security Code is " + seccode);
	}
	
	public static void main(String[] args) {
		SuperChildConstructor obj = new SuperChildConstructor("admin", "admin", 345);
		
		obj.login();
		obj.printseccode();

	}

}
