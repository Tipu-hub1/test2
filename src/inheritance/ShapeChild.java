package inheritance;


public class ShapeChild extends ShapeParent {
	public int side1= 8;
	public int side2 = 12;
	
	public void areaofTriganle() {
		int a = (side1 + side2)/2 ;
		System.out.println("Area of triangle" + a);
	}
	
	public static void main(String[] args) {
		ShapeChild obj = new ShapeChild();
		System.out.println(obj.length); // protected members
		System.out.println(obj.width); // protected members
		obj.areaofrectangle(); // protected method
		System.out.println(obj.radius);
		obj.areaofcircle();
		System.out.println(obj.side);
		obj.areaofsquare();
		
		//System.out.println(obj.PI_VAL);
		//obj.printPI();
		
		obj.areaofTriganle();

	}

}
