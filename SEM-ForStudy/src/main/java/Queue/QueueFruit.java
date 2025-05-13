package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFruit {

	public static void fruits() {

		Queue<String> fruit = new LinkedList<>(Arrays.asList("Apple", "Orange", "Pineapple", "Kiwi", "Berry"));
		System.out.println(fruit);

		Boolean emptyOrNot = fruit.isEmpty();
		System.out.println(emptyOrNot);

		String headElement = fruit.peek();
		/*peek() → Looks at the head (first element) of the queue without removing it.*/
		/*If the queue is empty, peek() will return null.*/
		System.out.println(headElement);
		System.out.println("Queue after peek: " +fruit);

		String removedElement = fruit.poll();
		/*poll() is used to remove and return the first (head) element of the queue*/
		/*After poll(), the head moves to the next element*/
		System.out.println("Poll (removed element): " + removedElement);
		System.out.println("Queue after poll: " + fruit);
		
		String elementInit = fruit.element();
		System.out.println("Element: " + elementInit);
;	}

	public static void main(String[] args) {
		fruits();
	}
}