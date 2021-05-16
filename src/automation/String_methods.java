package automation;

public class String_methods {

	public static void main(String[] args) {
		
// String hold group of characters
		// each String has an index
		
		String fString = "Selenium";
		String sString = "Testing is a good profession";
		
		System.out.println(fString.toUpperCase());
		System.out.println(sString.toLowerCase());
		
		System.out.println("length of the string is " + sString.length());
		System.out.println("fifth letter of the string is " + sString.charAt(4));
		
		System.out.println(sString.substring(10, 28));
		//output --- a good profession
		
		//System.out.println(sString.substring(10, 70));
		// out of bound exception...
		
		if (sString.startsWith("Selenium")) {
			System.out.println("Yes");
		}
		else {
			
			System.out.println("NO");
		}
		
		if (sString.endsWith("professions")) {
			
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		
		// concating two string 
		
		System.out.println(fString.concat(sString));
		//output: Selenium is a good profession
		
		System.out.println(fString + " "+sString);
		
		
		String S1 = "Automation1";
		String S2 = "Automation";
		
		if (S1.equals(S2)) {
			System.out.println("Both Strings are equal");
		}
		
		else {
			System.out.println("both Strings are not equal");
		}
		
		
		String S3 = "$Automation$";
		System.out.println(S3.replace("$", ""));
		
	}

}
