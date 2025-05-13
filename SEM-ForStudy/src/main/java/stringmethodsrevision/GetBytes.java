package stringmethodsrevision;

public class GetBytes {

	public static void getbytes() {
		String text = "Hello";
		
		byte[] resultArray = text.getBytes();
		byte result1 = resultArray[2];
		
		System.out.println(result1);
	}

	public static void main(String args) {
		getbytes();
	}

}