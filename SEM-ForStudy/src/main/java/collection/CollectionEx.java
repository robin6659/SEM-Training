package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx {

	public static void main(String[] args) {

		Collection<String> cars = new ArrayList<>();

		cars.add("BMW");
		cars.add("Porsche");
		cars.add("Toyota");
		cars.add("Nissan");

		System.out.println(cars);

		Iterator<String> iter = cars.iterator();

		iter.next(); /*Points to "BMW"*/

		/*Removing last element by next(),"BMW"*/
		iter.remove(); /*[Porsche, Toyota, Nissan]*/

		iter.next();/*Points to "Porsche"*/

		iter.remove();/*[Toyota, Nissan]*/

		System.out.println("New Collection List: " + cars); 
	}
}