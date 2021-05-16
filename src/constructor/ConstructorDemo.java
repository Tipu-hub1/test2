package constructor;

public class ConstructorDemo {

	float radius;
	int length;
	int width;
	/*
	ConstructorDemo (){
		System.out.println("this is my constructor printout");
	}
	*/
	
	ConstructorDemo (float r, int l, int w){
		radius = r; 
		length = l;
		width = w; 
	}
	
	public void areaOfcircle() { // Method without return and parameters
		//double area = Math.PI * radius * radius;
		double area =  radius * radius;
		System.out.println("area of circle : " + area);
	}
	
public void areaofRectangle() { //Method without return value and with parameters
		
		int area = length * width;
		System.out.println("area of rectangle : " + area);
		
	}
	
	
	public static void main(String[] args) {
		/*
		ConstructorDemo obj = new ConstructorDemo();
		
		System.out.println(obj.radius);
		System.out.println(obj.length);
		System.out.println(obj.width);
		
		obj.areaOfcircle();
		obj.areaofRectangle();
		obj.radius = 5.94f;
		obj.length = 39;
		obj.width = 40;
		obj.areaOfcircle();
		obj.areaofRectangle();
		
		*/
		ConstructorDemo obj = new ConstructorDemo(25.57f, 35, 45);
		
		System.out.println(obj.radius);
		System.out.println(obj.length);
		System.out.println(obj.width);
		
		obj.areaOfcircle();
		obj.areaofRectangle();
		
		ConstructorDemo obj3 = new ConstructorDemo(28.57f, 67, 85);
		System.out.println(obj3.radius);
		System.out.println(obj3.length);
		System.out.println(obj3.width);
		
		obj3.areaOfcircle();
		obj3.areaofRectangle();
	}

}
