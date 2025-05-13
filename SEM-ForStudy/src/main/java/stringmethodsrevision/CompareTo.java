package stringmethodsrevision;

public class CompareTo {

	public static void comapreto() {

		String str1 = "Apple";
		String str2 = "Samsung";
		String str3 = "Apple";

		int result1 = str1.compareTo(str2);
		System.out.println(result1);
		
		int result2 = str1.compareTo(str3);
		System.out.println(result2);

	}

	public static void main (String[] args) {
		comapreto();
	}

}