package automation;

public class StaticKeyword {

// Instance variable belongs to/created for every object
// Static variable belongs to only Class not any object-- so they are called class variable of class method.
	
	public String name = "Subarna";
	public static String Section = "A";
	
	public void PrintVal() {
		System.out.println(name);
		System.out.println(Section);// static variable can be used in instance method since this is class level
	}
	
	public static void Printall () {
		System.out.println(Section);
		//System.out.println(name); cannot call instance variable in static method without its object.
	}
	public static void main(String[] args) {
		
		//System.out.println(name);// cannot work becuase instance variable needs an object to use
		StaticKeyword obj = new StaticKeyword();
		System.out.println(obj.name);
		System.out.println(Section); // we can print this without object since this is static variable
		
		//PrintVal(); cannot call since this is instance method which need an object to call
		obj.PrintVal();
		
		Printall();
		// Static method or variable can be called from other class with class name. 

	}

}
