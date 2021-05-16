package UsingSuperKeyword;



public class ShapeChildSuper extends ShapeParentSuper{

	public float radius;
	
	
	public void areaofcircle() {
		printPI();
		double a = Math.PI * super.radius * super.radius;
		System.out.println("area of circle (Parent) : " + a);
	}
	
	@Override
	public void areaofrectangle() {	
		super.areaofrectangle(); // calling parent method. Need to use super becuase method name is same
		printPI(); // i dont need to use super becuase the method name is different and this is unique method.
		System.out.println("This is from my child class using Parent Class method");
	     
		}
	
	public static void areaofsquare() { // this is called Hiding...
		int a = side * side;
		System.out.println("Area of Square is "+ a);
	}
	
	
	public static void main(String[] args) {
		ShapeChildSuper obj = new ShapeChildSuper();
		
		obj.areaofcircle();
		System.out.println("-------------------");
		obj.areaofrectangle();
		obj.printPI();
		obj.areaofsquare();// child static metod
		ShapeParentSuper.areaofsquare(); // Parent static method

	}

}
