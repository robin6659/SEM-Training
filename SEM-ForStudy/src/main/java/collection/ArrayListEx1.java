package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void main(String args[]) {

		/*Create an ArrayList to store a list of names*/
		ArrayList<String> list = new ArrayList<String>();

		/*Add names to the list, collecting user input entries*/
		list.add("Samsung");
		list.add("Apple");
		list.add("Samsung"); /*Duplicates are allowed in List*/
		list.add("Nothing");
		list.add("Google");

		/*Iterator to read each one by one*/ 
		/*Iterator is used when we want to traverse a collection*/
		Iterator<String> itr = list.iterator();

		/*while loop to iterate*/
		/*itr.hasNext() checks if there are element to read*/
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}