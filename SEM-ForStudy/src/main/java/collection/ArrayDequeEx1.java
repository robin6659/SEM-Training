package collection;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeEx1 {
	public static void main(String[] args) {

		/*
		 Deque (Double-Ended Queue): A linear collection that allows 
		 insertion and removal of elements from both ends.
		 ArrayDeque is a resizable-array implementation of the Deque interface.
		 It does NOT allow null elements.
		 */
		Deque<String> deque = new ArrayDeque<String>();

		/*
		 add: Inserts the specified element at the end of the deque.
		 Throws NullPointerException if the element is null.
		 */
		deque.add("Porsche");
		deque.add("BMW");
		deque.add("Mercedes");
		deque.add("Nissan");
		deque.add("Toyota");

		/*
		 Enhanced for loop to iterate through the elements in the deque.
		 Note: In ArrayDeque, iteration happens from front to back.
		 */
		for (String str : deque) {
			System.out.println(str);
		}
	}
}