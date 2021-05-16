package automation;

public class UsingFinalKeyword {

	/* final keyword can be used
	 * 1. Variable
	 * 2. Method
	 * 3. Class
	*/
	
	public float radius = 9.75f;
	
	public final float PIVAL = 3.14f; // constant value
	
	public static final float PI_VAL = 5.15f;
	
	public void area() {
		double areaofcircle = PIVAL*radius*radius;
		System.out.println(areaofcircle);
	}
	
	public static void main(String[] args) {
		
		UsingFinalKeyword obj = new UsingFinalKeyword();
		
		System.out.println(obj.radius);
		obj.radius = 10.65f;
		System.out.println(obj.radius);
		
		// Example Math.PI
		//obj.PIVAL = 3.15f; cannot change the value since this is final 
		
		//PI_VAL = 6.25f; cannot change the value since this is final 
		System.out.println(PI_VAL); // no need to create object since this is static
		
		obj.area();
		
		
		
	}

}
