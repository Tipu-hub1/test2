package override;

public class ShapeParentOverride {
	public float radius = 5.78f;
	int side = 7;
	public static final float PI_VAL = 3.14f;
	protected int length = 9;
	protected int width = 19; 
	
	
	public void areaofcircle(float r) {
		double a = Math.PI * r * r;
		System.out.println("area of circle (Parent) : " + a);
	}
	
	
	void areaofsquare() {
		int a = side * side ;
		System.out.println("area of circle : " + a);
	}
	
	public static void printPI() {
		System.out.println("PI value is (Parent) : " + PI_VAL);
	}
	
	
	protected void areaofrectangle() {	
	int a = length * width;
	System.out.println("area of rectangle : " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
