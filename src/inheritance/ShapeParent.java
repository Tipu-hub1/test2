package inheritance;



public class ShapeParent {

	public float radius = 5.78f;
	int side = 7;
	private final float PI_VAL = 3.14f;
	protected int length = 9;
	protected int width = 19; 
	
	
	public void areaofcircle() {
		double a = Math.PI * radius * radius;
		System.out.println("area of circle : " + a);
	}
	
	
	void areaofsquare() {
		int a = side * side ;
		System.out.println("area of circle : " + a);
	}
	
	private void printPI() {
		System.out.println("PI value is : " + PI_VAL);
	}
	
	
	protected void areaofrectangle() {	
	int a = length * width;
	System.out.println("area of rectangle : " + a);
	}

	public static void main(String[] args) {
		
		ShapeParent obj = new ShapeParent();
		obj.areaofcircle();
	}

}
