package Revision;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main (String[] args) {

		String[] testArray = {"Login","Logout","Checkin","Checkout"};
		
		List<String> testList = Arrays.asList(testArray);
		
		System.out.println(testList);
	}

}