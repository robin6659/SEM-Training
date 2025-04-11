package stringmethods;

public class GetBytes {

	public static void main(String[] args) {
		String myStr = "Hello";
		byte[] result = myStr.getBytes();
		System.out.println(result[0]);
	}


}