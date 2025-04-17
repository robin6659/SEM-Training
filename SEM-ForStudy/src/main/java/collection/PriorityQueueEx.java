package collection;

import java.util.*;

public class PriorityQueueEx {
	public static void main(String args[]) {

		/* Creating a PriorityQueue of Strings */
		PriorityQueue<String> queue = new PriorityQueue<String>();

		/* 
         Adds an element to the queue.
         Throws an exception if the capacity is exceeded (in bounded queues).
		 */
		queue.add("Aprilia");
		queue.add("BMW");
		queue.add("Triumph");
		queue.add("Ducati");
		queue.add("Kawasaki");

		/*
         element(): Retrieves, but does NOT remove, the head of the queue.
          Throws NoSuchElementException if the queue is empty.
		 */
		System.out.println("head (using element()): " + queue.element());

		/*
          peek(): Retrieves, but does NOT remove, the head of the queue.
          Returns null if the queue is empty.
         Safer alternative to element().
		 */
		System.out.println("----------------------------");
		System.out.println("head (using peek()): " + queue.peek());

		/*
         iterator(): Returns an iterator over the elements in this queue.
         Note: The order of iteration is not guaranteed in PriorityQueue
          because it uses a heap structure internally.
		 */
		System.out.println("----------------------------");
		System.out.println("Iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
          remove(): Removes and returns the head of the queue.
         Throws NoSuchElementException if the queue is empty.
		 */
		queue.remove();

		/*
         poll(): Removes and returns the head of the queue.
         Returns null if the queue is empty.
         Safer alternative to remove().
		 */
		queue.poll();

		System.out.println("----------------------------");
		System.out.println("After removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}