package basicprinting;

public class Printing {

	public static void PrintProg () {

		int a = 5;
		int b = 7;
		int age = a+b;

		String yourName = "XYZ";
		System.out.println("Age is "+age);
		System.out.println("Name is "+yourName);
	}

	public static void main (String[] args){
		System.out.println("Hello World");
		PrintProg();
	}
}