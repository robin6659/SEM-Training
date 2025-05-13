package stringmethodsrevision;

public class CharAt {

	public static void charat() {

		String myText = "Hello";

		char result1 = myText.charAt(1);
		System.out.println("Index at 1: "+result1);

		char result2 = myText.charAt(4);
		System.out.println("Index at 4: "+result2);
	}

	public static void main (String[] args) {
		charat();
	}

}