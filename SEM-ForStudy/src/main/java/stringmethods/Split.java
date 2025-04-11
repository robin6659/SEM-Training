package stringmethods;

public class Split {

	public static void main(String[] args) {
		String myStr = "Split a string by spaces, and also punctuation.";
		String regex = "[,\\.\\s]";

		String[] myArray = myStr.split(regex);

		for (String s : myArray) {
			System.out.println(s);
		}
	}

}
/*Step 1: split()*/
/*myArray = {"Split", "a", "string", "by", "spaces", "and", "also", "punctuation"}*/

/*Step 2: For-Each Loop 
→ First time s = "Split"
→ Second time s = "a"
→ Third time s = "string"
→ and so on...*/