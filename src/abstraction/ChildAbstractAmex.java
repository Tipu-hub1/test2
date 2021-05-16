package abstraction;

public class ChildAbstractAmex extends ParentAbstract{



	@Override
	public String confirmpayment() {
		// authorizing card details
				System.out.println(cardno);
				System.out.println(custmername);
				// connecting to IBM MongoDB or MySQL or Microsoft SQL Server database
				// matching the data
				// checking the credit limit
		return "Not enought Balance";
	}

	@Override
	public boolean reduceamount() {
		System.out.println("Deducted amount from user's card");
		System.out.println("Amount added to the Amazon account");
		return false;
	}
//	@Override    --- final method cannot be overriden 
//	public final void carddetails() {
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		ChildAbstractAmex obj = new ChildAbstractAmex();
		obj.collectcarddetails();
		System.out.println( obj.confirmpayment());

	}

}
