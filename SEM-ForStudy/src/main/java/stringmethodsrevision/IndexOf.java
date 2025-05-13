package stringmethodsrevision;

public class IndexOf {

	public static void indexof() {

		String text ="Hello World";

		int result1 = text.indexOf("H");
		System.out.println("index of H: "+result1);
		
		int result2 = text.indexOf("W");
		System.out.println("index of W: "+result2);
		
		int result3 = text.indexOf("NA");
		System.out.println("index of NA: "+result3);

	}

	public static void main (String[] args) {
		indexof();
	}

}