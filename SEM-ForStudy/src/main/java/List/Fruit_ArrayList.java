package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Fruit_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		System.out.println(fruits);

		String getFruit = fruits.get(2);
		System.out.println(getFruit);

		fruits.set(0, "Kiwi");

		System.out.println("After set: "+fruits);

		if(fruits.contains("Kiwi")) {
			System.out.println("it contains");
		} else {
			System.out.println("na");

		}
		
		Boolean fruitContains = fruits.contains("Kiwi");
		System.out.println(fruitContains);
		
		int fruitIndex = fruits.indexOf("Banana");
		System.out.println("Index of Banana: " + fruitIndex);
		
		String fruitAtIndex = fruits.get(1);
		System.out.println("Fruit at index 1: " + fruitAtIndex);
		
        System.out.println("--------------");

        Iterator<String> it = fruits.iterator();

        System.out.println("Using Iterator:");
        
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            // Example: removing Banana during iteration
            if (fruit.equals("Banana")) {
                it.remove();  // safe removal using Iterator
            }
        }

        System.out.println("After removal: " + fruits);

	}

}