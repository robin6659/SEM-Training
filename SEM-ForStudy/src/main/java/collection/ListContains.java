package collection;

import java.util.ArrayList;

public class ListContains {

	public static void main(String[] args) {

		ArrayList<Object> itemList = new ArrayList<>();

		itemList.add(1);
		itemList.add(10);
		itemList.add("Hello World");
		itemList.add(30);
		itemList.add("Hello");

		boolean containsHello = itemList.contains("Hello");
		
		System.out.println("Does the list contain 'Hello'? " + containsHello);
	}

}