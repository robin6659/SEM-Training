package stringmethods;

public class Format {
	public static void main(String[] args) {
		
		String Str1 = "Hello %s! One kilobyte is %,d bytes.";
		
		String Str2 = "Hello%nbytes.";


		String result1 = String.format(Str1, "World", 1024);
		String result2 = String.format(Str2);

		System.out.println(result1);
		System.out.println(result2);

	}
}