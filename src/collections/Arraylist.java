package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Arraylist {
// Collection is an Interface , List is a Interface, Set is a Interface
	// Set is a element that cannot contain duplication value - single data type-- set does not maintain the execution order... it takes his own order- 
	// Set also can grow and shrink-
	// Set we cannot sort out because there is no execution order
	// List can contain duplicate value . As we know arrays are fixed in size but list can expand and squeeze.- Single data type- no size declared
	// Execution order maintained in List that is why List is called ordered collection...
	// Map Interface -- Key and value - Key must be Uniaue-- but value can have repeatition ..
	// Map - Key is the main source access your element or value
	
	
	// List Interface has many class but we only need Arraylist
	// Set Interface has two classes but we only need HashSet
	//
	
	public static void aList() {
		
		List<Integer> obj = new ArrayList<Integer>();
		System.out.println("Is empty "+ obj.isEmpty());
		System.out.println(obj.size());
		
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(20);
		obj.add(60);
		obj.add(70);
		obj.add(80);
		obj.add(90);
		System.out.println("Size of Arraylist is " + obj.size());
		System.out.println(obj);
		System.out.println("Value at index 3 "+ obj.get(3));
		obj.add(100); // it will add at the end
		System.out.println(obj);
		System.out.println("Size of Arraylist is " + obj.size());
		// If I want to add a particular value in a certain position
		
		obj.add(0, 10);
		System.out.println("Size of Arraylist is " + obj.size());
		System.out.println(obj); // It will change the index position for all elements
		obj.add(1, 15);
		System.out.println("Size of Arraylist is " + obj.size());
		System.out.println(obj); // It will change the index position for all elements that means it is not fixed in nature
		
		// If I want to check a particular value is there?
		System.out.println("Contains 60 " +obj.contains(60)); // will give boolean value
		System.out.println("Contains 110 "+obj.contains(110));
		System.out.println("Is empty "+ obj.isEmpty());
		obj.set(0, 200);
		System.out.println(obj);
		obj.remove(0);
		System.out.println("Size of Arraylist is " + obj.size());
		System.out.println(obj);
		//obj.clear();
		
		
		Collections.sort(obj);
		System.out.println("After sorting "+obj);
		
		
		Collections.reverse(obj);
		System.out.println("After reverse "+obj);
		
		Collections.shuffle(obj);
		System.out.println("After shuffling " + obj);
		
		System.out.println("Minimum value " +Collections.min(obj));
		
		System.out.println("Maximum Value " +Collections.max(obj));
				
		List<Integer> obj2 = new ArrayList<Integer>();
		obj2.add(20);
		obj2.add(30);
		obj2.add(40);
		obj2.add(50);
		obj2.add(20);
		obj2.add(60);
		obj2.add(70);
		obj2.add(80);
		obj2.add(90);
		
		System.out.println("obj is equal to obj2 " + obj.equals(obj2));
		System.out.println("obj2 is equal to obj2 " + obj2.equals(obj2));
		
		// we may check them lets say dropdown in webpage and match the same in db... 
		System.out.println("printing arraylist using for  loop");
		for (int i = 0; i<obj.size(); i++) {
			System.out.print(obj.get(i) + " ");
		}
		System.out.println();
		System.out.println("printing arraylist using for each loop");
		
		for (Integer aval : obj) {
			System.out.print(aval + " ");
		}
		
		// Iterator has 3 method -- a. Hasnext, 
		
		Iterator<Integer> it = obj.iterator();
		System.out.println();
		System.out.println("Printing arraylist using Iterator");
		while (it.hasNext()) {    // by default it pointing to the first element
			System.out.print(it.next() + " ");
		}
	}
	public static void main(String[] args) {
		aList();

	}

}
