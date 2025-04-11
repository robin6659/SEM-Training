package stringmethods;

public class CodePointCount {
	public static void main(String[] args) {

		String myStr = "Hello";

		/*(beginIndex, endIndex)*/ 
		int result = myStr.codePointCount(0, 5);  /*Counting from index 0 to index 4*/

		System.out.println(result);
	}
}