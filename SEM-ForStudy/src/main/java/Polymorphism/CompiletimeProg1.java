package Polymorphism;

public class CompiletimeProg1 {
/*overloading*/
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public static void main (String[] args) {

		System.out.println("Add two numbers" +add(10,40));
		System.out.println("Add three numbers"+add(5,3,2));

		System.out.println("Multiply two numbers"+multiply(3,2));
		System.out.println("Multiply three numbers"+multiply(3,3,1));
	}

}