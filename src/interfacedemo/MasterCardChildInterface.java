package interfacedemo;

public class MasterCardChildInterface implements PaymentInterface {

	

	@Override
	public boolean confirmPayment() {
		System.out.println("User Payment accepted");
		return true;
	}

	@Override
	public boolean reduceAmount() {
		System.out.println("Amount deducted");
		return true;
	}

	
	public static void main(String[] args) {
		MasterCardChildInterface obj =new  MasterCardChildInterface();
		
		//obj.PI_VAL = 3.15f; // cant reassign because by default it is final in Interface
		System.out.println(obj.PI_VAL);
	}
	
} 