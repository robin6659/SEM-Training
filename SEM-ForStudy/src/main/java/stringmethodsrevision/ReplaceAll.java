package stringmethodsrevision;

public class ReplaceAll {

	public static void replaceall() {

		String text = "Hello World, Welcome to the World of Java";

		String result1 = text.replaceAll("World", "Universe");
		System.out.println(result1);
	}

	public static void main(String[] args) {
		replaceall();
	}

}