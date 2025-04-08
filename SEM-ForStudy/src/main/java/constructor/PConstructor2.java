package constructor;

public class PConstructor2 {

	String name;
	int age;

	/*Constructor 1*/
	PConstructor2() {
		System.out.println("Default");
	}

	/*Constructor 2*/
	PConstructor2(String n) {
		name = n;
	}
	/*Constructor 3*/
	PConstructor2(String n, int a) {
		name = n;
		age = a;
	}

	void display() {
		System.out.println(name);
		System.out.println(age);
	}


	public static void main (String[] args) {
		PConstructor2 info1 = new PConstructor2(); /*Invoking Constructor 1*/
		PConstructor2 info2 = new PConstructor2("Robin"); /*Invoking Constructor 2*/
		PConstructor2 info3 = new PConstructor2("Robin",2); /*Invoking Constructor 3*/

		info2.display();
		info3.display();

	}
}