package stringmethodsrevision;

public class Trim {

	public static void trimmed() {
		String text ="    Hello      ";

		String result = text.trim();

		System.out.println(/*"untrimmed"+*/text);
		System.out.println(result);

	}

	public static void main(String[] args) {
		trimmed();
	}

}