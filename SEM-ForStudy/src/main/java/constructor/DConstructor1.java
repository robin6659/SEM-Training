package constructor;

public class DConstructor1 {
	String name;
	int className;
	DConstructor1(String n, int c) {
		name = n;
		className = c;

		System.out.println(name+" "+className);
	}
	public static void main (String[]args) {
		DConstructor1 info = new DConstructor1("Eva",12);
	}
}