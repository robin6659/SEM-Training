package collection;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListEx1 {
	public static void main(String args[]) {
		
		 /*doubly linked nodes (each points to next & previous)*/

		/*Create an ArrayList to store a list of names*/
		LinkedList<String> al = new LinkedList<String>();

		/*Duplicates are allowed in LinkedList*/
		al.add("Samsung");
		al.add("Apple");
		al.add("Google");
		al.add("Samsung");
		al.add("Nokia");


		/*Create an Iterator to traverse the LinkedList*/
		Iterator<String> itr = al.iterator();

		/*Loop through the LinkedList using the Iterator*/
		/*.hasNext() checks if there are more elements*/
		/*.next() retrieves the next element in the list*/
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}