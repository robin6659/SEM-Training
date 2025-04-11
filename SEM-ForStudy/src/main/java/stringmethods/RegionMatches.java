package stringmethods;

public class RegionMatches {

	public static void main(String[] args) {
		
		String myStr1 = "Hello, World!";
		String myStr2 = "New World";
		
		String Str1 = "Hello, Robin";
		String Str2 = "Robin, Hello";
		
		System.out.println(myStr1.regionMatches(7, myStr2, 4, 5));
		System.out.println(myStr1.regionMatches(0, myStr2, 0, 5));
		
		System.out.println(myStr1.regionMatches(7, Str2, 4, 5));
		System.out.println(myStr1.regionMatches(0, Str2, 0, 5));
	}

}