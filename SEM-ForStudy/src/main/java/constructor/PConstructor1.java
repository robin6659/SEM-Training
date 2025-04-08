package constructor;

public class PConstructor1 {

	int length;
	int breadth;

	public PConstructor1(int l, int b) {

		length = l;
		breadth = b;
	}

	void area() {
		int result = length * breadth;
		System.out.println(result);
	}

	public static void main (String[] args) {
		PConstructor1 rectangle = new PConstructor1(2,3);

		rectangle.area();
	}

}