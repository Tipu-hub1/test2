package encapsulation;

public class EncapDemo2 {

	public static void main(String[] args) {
		
		EncapDemo obj = new EncapDemo();
		
		obj.setName("Bashir");
		obj.setId(101);
		obj.setAge(40);
		
		System.out.println("my name "+ obj.getName() + "My Age "+obj.getAge() + " my id "+ obj.getId());

	}

}
