package automation;

public class Access {

		public int p = 78;
		private float pr = 78.95f;
		String name = "John";
		
		public void printp() {
			System.out.println(p);
		}
		
		private void printpr() {
			System.out.println(pr);
		}
		
		void printname() {
			System.out.println(name);
		}
	public static void main(String[] args) {
	
		Access obj = new Access();
		obj.printp();
		obj.printpr();
		obj.printname();
		
		System.out.println(obj.p);
		System.out.println(obj.pr);
		System.out.println(obj.name);

	}

}
