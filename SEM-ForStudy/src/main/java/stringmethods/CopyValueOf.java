package stringmethods;

public class CopyValueOf {

	public static void main(String[] args) {
		
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 2);
		System.out.println("Returned String: " + myStr2);  
	}

}