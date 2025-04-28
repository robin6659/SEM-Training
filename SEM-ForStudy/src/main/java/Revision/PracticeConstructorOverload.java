package Revision;

public class PracticeConstructorOverload {

	String model;
	int year;

	PracticeConstructorOverload() {
		model="unknown";
		year = 0000;
	}

	PracticeConstructorOverload(String c) {
		model = c;
		year = 2004;
	}

	PracticeConstructorOverload(String c, int y) {
		model = c;
		year = y;
	}

	void output() {
		System.out.println(""+model+" "+year);
	}

	public static void main(String[] args) {

		PracticeConstructorOverload car1 = new PracticeConstructorOverload();
		PracticeConstructorOverload car2 = new PracticeConstructorOverload("Suzuki");
		PracticeConstructorOverload car3 = new PracticeConstructorOverload("Toyota", 2003);

		car1.output();
		car2.output();
		car3.output();

	}

}