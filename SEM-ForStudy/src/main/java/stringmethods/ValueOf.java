package stringmethods;

public class ValueOf {
	
	public static void main(String[] args) {
		char[] myArray = {'a', 'b', 'c'};
		
		System.out.println(String.valueOf(myArray));
		System.out.println(String.valueOf('A'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(4.5f));
		System.out.println(String.valueOf(5.2));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(1400L));
	}
}