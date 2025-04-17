package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String args[]) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("Kawasaki");
		set.add("Yamaha");
		set.add("Aprilia");
		set.add("Ducati");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}