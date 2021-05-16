package interfacedemo;

public interface PaymentInterface { // reference type

	// this is 100 abstraction because they do not have any instance method
	// all the method you include by default abstract, you dont need to give Abstract keyword
	// any varialbe you include in the interface becomes constant, you do not need to give final keyword

 //2
	public float PI_VAL = 3.14f; // by default constant
	
	//1
	
	public boolean confirmPayment(); // by default this is abstract

	public boolean reduceAmount(); // by default this is abstract
	
	// 3
	default void defmethod() {  // that comes after java 8
		System.out.println("This is my default method");
	}
	
	//4
	static void statmethod() {  // that comes after java 8
		System.out.println("This is my static method");
	}


}

