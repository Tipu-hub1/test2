package superConstructor;

public class SuperParentConstructor {

	public String username;
	public String password;
	
	SuperParentConstructor(String uname, String pwd){
		
		username = uname;
		password = pwd;
	}
	
	public void login () {
		System.out.println("My username is  " + username);
		System.out.println("My password is  " + password);
	}
	
	public static void main(String[] args) {
		
		SuperParentConstructor obj = new SuperParentConstructor("guest", "guest");
		
		obj.login();
		
	}

}
