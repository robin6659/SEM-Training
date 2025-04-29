package Revision;

import java.util.Arrays;
import java.util.Collections;

public class SortArr {

	public static void sortAscending(Integer[] arr) {
		Arrays.sort(arr);
	}

	public static void sortDescending(Integer[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
	}

	public static void main(String[] args) {

		/*Integer[] → object array → SUPPORTED by Collections.reverseOrder().*/

		Integer[] arr = {8, 4, 7, 2, 5, 0};

		sortAscending(arr);
		System.out.println("Ascending: " + Arrays.toString(arr));

		sortDescending(arr);
		System.out.println("Descending: " + Arrays.toString(arr));
	}
}