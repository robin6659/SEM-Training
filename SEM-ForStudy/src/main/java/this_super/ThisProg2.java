package this_super;

public class ThisProg2 {

	public void add(int a, int b) {
		System.out.println("Sum" +(a + b));
	}

	public void add(int a, int b, int c) {
		this.add(a, b);
		System.out.println("Sum" +(a + b +c));
	}

	public static void main (String[] args) {
		ThisProg2 calc = new ThisProg2();

		calc.add(10, 10);
		calc.add(10, 12, 13);
	}
}