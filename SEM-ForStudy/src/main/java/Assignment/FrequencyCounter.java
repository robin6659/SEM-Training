package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyCounter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Count frequencies
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i);

			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} else {
				frequencyMap.put(num, 1);
			}
		}

		// Print frequencies without using :
		// Get all keys as a list
		ArrayList<Integer> keys = new ArrayList<>(frequencyMap.keySet());

		// Loop through keys using basic for loop
		for (int i = 0; i < keys.size(); i++) {
			int key = keys.get(i);
			int value = frequencyMap.get(key);
			System.out.println("Number " + key + " appears " + value + " times.");
		}
	}
}
