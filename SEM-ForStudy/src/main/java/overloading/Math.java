package overloading;

public class Math {

	public void add1(int a, int b) {
		int resultAdd1 = a+b;
		System.out.println(resultAdd1);
	}

	public void add2(int a, int b, int c) {
		int resultAdd2 = a+b+c;
		System.out.println(resultAdd2);
	}

	public static void main(String[] args) {
		Math math = new Math();

		math.add1(4, 2);
		math.add2(4, 2, 5);

	}

}