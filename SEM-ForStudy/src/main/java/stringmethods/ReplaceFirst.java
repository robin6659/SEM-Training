package stringmethods;

public class ReplaceFirst {
	
	public static void main(String[] args) {
		
		String myStr = "This is a Car";
		String regex = "is";
		
		System.out.println(myStr.replaceFirst(regex, "at"));
		
	}

}