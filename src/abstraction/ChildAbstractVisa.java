package abstraction;

// child can have its instance method as well
// real time example -- login--- logout
public class ChildAbstractVisa extends ParentAbstract {

	
	

	@Override
	public String confirmpayment() {
		// authorizing card details
		System.out.println(cardno);
		System.out.println(custmername);
		// connecting to IBM DB2 database
		// matching the data
		// checking the credit limit
		return "Payment Accepted" ;
	}

	
public static void main(String[] args) {
	ChildAbstractVisa obj = new ChildAbstractVisa();
	obj.collectcarddetails();
	System.out.println(obj.confirmpayment()); 
	
	

	}


@Override
public boolean reduceamount() {
System.out.println("Deducted amount from user's card");
System.out.println("Amount added to the Amazon account");
	return true;
}
	
}
