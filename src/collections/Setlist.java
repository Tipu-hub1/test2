package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Setlist {
// usually unique values we use SET ... lets say employee id, Student Id...cannot contain duplicate values
	// Hashset is a class
	// allows null value
	// does not maintain insertion order
	// good for search operation
	// we cannot update.. we can remove one and add one...
	
	
	public static void setDemo() {
		Set<String> hs = new HashSet<String>();
		
		System.out.println("Is empty "+ hs.isEmpty());
		System.out.println("Is empty "+ hs.size());
		hs.add("Java");
		hs.add("is");
		hs.add("object");
		hs.add("oriented");
		hs.add("Programming");
		hs.add("Language");
		
		System.out.println("Is empty "+ hs.isEmpty());
		System.out.println("Is empty "+ hs.size());
		
		System.out.println(" Contains : "+hs.contains("programming"));
		System.out.println("Hashcode : "+hs.hashCode());
		System.out.println(" Remove : "+hs.remove("Language"));
		
		Collections.min(hs);
		Collections.max(hs);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
