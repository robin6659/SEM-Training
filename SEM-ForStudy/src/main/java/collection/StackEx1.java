package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEx1 {

	public static void main(String args[]) {

		/*Stack follows LIFO (Last In, First Out) order*/ 
		Stack<String> stack = new Stack<String>();

		/*Push (add) elements onto the stack*/ 
		stack.push("BMW");
		stack.push("Triumph");
		stack.push("Ducati");
		stack.push("Kawasaki");
		stack.push("Aprilia");  // This is now at the top of the stack

		/*Pop (remove) the top element*/
		/*Removes "Aprilia" because it was the last pushed element (LIFO)*/
		stack.pop();

		/*Iterator to go through the elements in the stack*/
		/*(oldest to newest)*/
		Iterator<String> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}