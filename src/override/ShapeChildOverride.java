package override;

public class ShapeChildOverride extends ShapeParentOverride{
//override also can happens in inheritance (parent child relationship
	// The override method has to be same as parent methods like access modifier, data type, and parameter (child method would need higher access mo
	// Whenever we override a method in the child class we usually give a @Override annotation that gives a message to compiler to consider this as override method
	// Static method always impletment from child class and this is called Hiding. 
	@Override
	public void areaofcircle(float r) {
		double a = Math.PI * r * r;
		System.out.println("area of circle (Child) : " + a);
	}
	
	
	public static void printPI() {
		System.out.println("PI value is (Child): " + PI_VAL);
	}
	
	public static void main(String[] args) {
		ShapeChildOverride obj = new ShapeChildOverride();
		
		obj.areaofcircle(5.75f);
		obj.printPI();
		ShapeParentOverride.printPI();
	}

}
