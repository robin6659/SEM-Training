package overloading;

public class Add {

	public void  add (String a, String b) {

		String c = a+b;
		System.out.println(c);
	}

	public void add (int a, int b) {

		int c = a+b;
		System.out.println(c);

	}

	public void add (int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
	}

	public static void main (String[] args) {
		Add adds = new Add();

		adds.add("Hello ","add");
		adds.add(2,6);
		adds.add(2,6,10);


	}
}