package abstraction;

public abstract class ParentAbstract {
	// Abstraction is the process hiding the implementation details and showing only functionality 
	// ------------------------------- interface ----------------
	// interface means they do not have any implementation, only have the process, the implementation works in another class or another place.
	// in online payment process interface only taking data from user (user id, password, credit card, expiration date) and implement in the actual server like paypal
	// payment gateway.... purchase overlimit, invalid user....


	// In abstract class - there are instance and abstract method (0 -100 % abstraction)
	// In interface there are all abstract method ( 100% abstraction)
	// whenever any class becomes abstract, you cannot make an object of this abstract class..
	// if you do not have any abstract method within it abstract class -- -this is 0% abstraction
	// If my class has only abstract method --- this is called 100% abstraction
	// If you have at least one abstract method... you class must be abstract.
	// but your abstract class may not have any abstract method

	 // ---- final has three option...
	// 1. final class you cannot make it parent 2. final method you cannot override 3. final variable you cannot change the value, it is constant 
	
	String cardno;
	String custmername;
	
	public abstract String confirmpayment();
	
	public abstract boolean reduceamount();
	
	public void collectcarddetails() {
		
		cardno = "58498080544";
		custmername = "John Micheal";
		//System.out.println("CardNumber "+ cardno);
		//System.out.println("Customer Name "+ custmername);
	}

	//protected abstract final void carddetails(); // cannot make final because you cannot override it in the child class
	
	public static void main (String[]args) {
		// you cannot create an object of an abstract class
		// because you cannot implement the method which dont have a body
		//ParentAbstract obj = new ParentAbstract();
		
	}
	
}
