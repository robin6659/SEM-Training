package variables;

public class LocalMul {

	public static void multiply() {
		int a = 7;
		int b = 2;
		int c = a * b;

		System.out.println(c);

	}
	public static void main (String[] args) {
		LocalMul mulObj = new LocalMul ();
		mulObj.multiply();
	}

}