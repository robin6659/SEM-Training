package stringmethodsrevision;

public class Replace {

	public static void replace() {

		String text = "Hello";
		System.out.println(text.replace('H', 'R'));
		
		String result2 = text.replace('e','i');
		System.out.println(result2);

	}

	public static void main (String[] args) {
		replace();
	}

}