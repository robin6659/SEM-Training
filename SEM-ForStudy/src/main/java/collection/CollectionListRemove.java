package collection;

import java.util.ArrayList;

public class CollectionListRemove {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(20);
		numberList.add(40);
		numberList.add(60);
		numberList.add(80);

		System.out.println("Original List: " + numberList);

		/*Clear all elements from list*/
		numberList.clear();

		/*Checking the list is empty*/
		boolean isListEmpty = numberList.isEmpty();
		System.out.println("Is the list empty? " + isListEmpty);
	}


}