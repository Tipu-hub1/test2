package UsingSuperKeyword;

// Super keyword is used to call parent class member and method from the child class.
public class ShapeParentSuper {
	
	public float radius = 5.78f;
	int length = 20;
	int width = 30;
public static int side = 10;
	public static final float PI_VAL = 3.14f;
	
	public void areaofrectangle() {	
		int a = length * width;
		System.out.println("area of rectangle : " + a);
		}

	public static void areaofsquare() {
		int a = side * side;
		System.out.println("Area of Square is "+ a);
	}
	
	public void printPI() {
		System.out.println("PI value is (Parent) : " + PI_VAL);
	}
	
	

}
