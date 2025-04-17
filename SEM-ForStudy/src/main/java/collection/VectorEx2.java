package collection;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Integer> num = new Vector<>();

		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		num.add(70);

		System.out.println("Initial Vector: " + num);

		num.remove((Integer) 70);
		System.out.println("After removing 70: " + num);

		num.remove(2);
		System.out.println("After removing element at index 2: " + num);

		num.removeElementAt(3);
		System.out.println("After removeElementAt(2): " + num);

		int value = num.get(2);
		System.out.println("Element at index 2: " + value);

	}	

}