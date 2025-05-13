package List;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone_ArrayList {

	public static void mobilephones() {

		ArrayList<String> mobile = new ArrayList<String>();

		mobile.add("Apple");
		mobile.add("Samsung");
		mobile.add("Nothing");
		mobile.add("Google");

		System.out.println(mobile);

		String getMobile = mobile.get(2);
		System.out.println(getMobile);

		mobile.set(3, "OnePlus");
		System.out.println("output after set: "+mobile);

		int mobileSize = mobile.size();
		System.out.println("size: "+mobileSize);

		if (mobile.contains("apple")) {
			System.out.println("it contains Apple");
		} else {
			System.out.println("NA");

		}

		mobile.add("Xiaomi");
		System.out.println("adding new mobile: "+mobile);

		mobile.remove(4);
		System.out.println("after remove: "+mobile);

		ArrayList<String> moreMobiles = new ArrayList<>(Arrays.asList("Realme", "Motorola"));
		mobile.addAll(moreMobiles);
		System.out.println("after addAll: "+mobile);

	}

	public static void speakers() {

		ArrayList<String> speaker = new ArrayList<>(Arrays.asList("Bose","Sony","Marshall"));
		System.out.println(speaker);

		boolean removeResult = speaker.removeAll(speaker);
		System.out.println(removeResult);
		System.out.println("list after remove: "+speaker);

	}

	public static void main (String[] args) {
		mobilephones();
		speakers();
	}

}