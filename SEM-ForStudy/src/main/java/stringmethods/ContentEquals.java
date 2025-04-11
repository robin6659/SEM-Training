package stringmethods;

public class ContentEquals {

	public static void main(String[] args) {
		String myStr = "Java";
		System.out.println(myStr.contentEquals("Python"));
		System.out.println(myStr.contentEquals("e"));
		System.out.println(myStr.contentEquals("Hi"));
		System.out.println(myStr.contentEquals("Java"));
	}

}