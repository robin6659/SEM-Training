package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");

		System.out.println("Number of elements in the set: " + colors.size());
	}

}