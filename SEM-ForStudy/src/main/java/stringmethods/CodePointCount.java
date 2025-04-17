package stringmethods;

public class CodePointCount {
	public static void main(String[] args) {

		String myStr = "HelloW";

		/*(beginIndex, endIndex)*/ 
		int result = myStr.codePointCount(0, 6);  /*Counting from index 0 to index 4*/

		System.out.println(result);
	}
}