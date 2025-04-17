package collection;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList<String> colour = new ArrayList<>();

		colour.add("Blue");
		colour.add("Red");
		colour.add("Pink");

		System.out.println("Initial List: " + colour);
		System.out.println("-----------------------");

		String secondFruit = colour.get(1); /*Indexing starts at 0*/
		System.out.println("Color at index 1: " + secondFruit);
		System.out.println("-----------------------");

		colour.set(1, "White");
		System.out.println("After set(): " + colour);
		System.out.println("-----------------------");

		colour.remove(2);
		System.out.println("After remove(): " + colour);
		System.out.println("-----------------------");

		colour.add("Yellow");
		
		/*Getting the current size of the list using size()*/
		
		/*interchange
		 * index
		 * */
		System.out.println("Size of list: " + colour.size());
		System.out.println("-----------------------");

		/*Checking if certain elements are present using contains()*/
		System.out.println("Contains 'Blue': " + colour.contains("Blue"));   /*True*/
		System.out.println("Contains 'Red': " + colour.contains("Red")); /*False*/
	}
}
