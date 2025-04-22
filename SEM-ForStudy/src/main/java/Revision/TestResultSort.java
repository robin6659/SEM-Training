package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestResultSort {

	public static void main (String[] args) {

		List <String> results = new ArrayList<>();
		
		results.add("Fail");
		results.add("Pass");
		results.add("Fail");
		results.add("Fail");
		results.add("Pass");
		results.add("Pass");
		results.add("A");
		results.add("A");
		results.add("B");


		Collections.sort(results);
		
		System.out.print(results);
	}

}