package constructor;

public class ConstructorWithThis {

	public float radius;  // instance variable 
	public int length;
	public int width;
	
	public ConstructorWithThis(float radius, int length, int width) { // this variable belongs to my constructor which is local variable)
		
		this.radius = radius;
		//this.length = length; 
		//this.width = width;
		System.out.println(radius);
		System.out.println(length);
		System.out.println(width);
	}
	
	public ConstructorWithThis(int length, int width) {
		
     this.length = length;
     this.width = width;
	}
	
	public void circle () {
		float a = radius * radius;
		System.out.println(a);
	}
	
	public void recrangle() {
		
		int area = length * width;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		
		ConstructorWithThis obj = new ConstructorWithThis(25.87f, 45, 46);
		
		obj.circle();
		obj.recrangle();
		
		
		ConstructorWithThis obj2 = new ConstructorWithThis(40.59f, 35, 98);

		obj2.circle();
		obj2.recrangle();
	}
	
	

}
