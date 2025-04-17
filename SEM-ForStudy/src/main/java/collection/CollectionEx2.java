package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx2 {

	public static void main(String[] args) {

		Collection<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Rose");
		colors.add("Blue");
		colors.add("Green");

		System.out.println("Original Collection: " + colors);
		System.out.println("------------------");

		/*Array size*/
		System.out.println("Size of collection: " + colors.size());
		System.out.println("------------------");

		System.out.println("Contains 'Blue'? " + colors.contains("Blue"));
		System.out.println("------------------");

		colors.remove("Rose");
		System.out.println("After removing 'Rose': " + colors);
		System.out.println("------------------");


		/*Using iterator to remove items while iterating*/
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String color = iterator.next();
			if (color.equals("Red")) {
				iterator.remove();
			}
		}
		System.out.println("After iterator removal: " + colors);
		System.out.println("------------------");

		/*Another collection*/
		Collection<String> moreColors = new ArrayList<>();

		moreColors.add("Yellow");
		moreColors.add("Purple");

		colors.addAll(moreColors);
		System.out.println("After addAll: " + colors);
		System.out.println("------------------");

		/*Remove all matching elements*/
		colors.removeAll(moreColors);
		System.out.println("After removeAll: " + colors);
		System.out.println("------------------");

		System.out.println("Is empty? " + colors.isEmpty());
		System.out.println("------------------");

		colors.clear();
		System.out.println("After clear: " + colors);
		System.out.println("------------------");
		System.out.println("Is empty now? " + colors.isEmpty());
	}

}