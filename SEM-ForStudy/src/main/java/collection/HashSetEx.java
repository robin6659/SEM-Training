package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String args[]) {  
		/*Creating a HashSet of String type*/
		HashSet<String> set = new HashSet<String>();  

		/*Duplicate values are not allowed in HashSet*/ 
		set.add("Apple");  
		set.add("Google");
		set.add("Google");  
		set.add("Samsung");  
		set.add("Samsung");

		/*HashSet does not maintain insertion order*/
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {  
			System.out.println(itr.next());
		}
	}  
}