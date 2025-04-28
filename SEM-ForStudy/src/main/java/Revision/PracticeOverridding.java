package Revision;

class Parent {
	void greet() {
		System.out.println("Hello from Parent");
	} 
}

class Child extends Parent {
	void greet() {
		super.greet();
		System.out.println("Hello from Child");
	}
}

public class PracticeOverridding {

	public static void main(String[] args)
	{
		Child objChild = new Child();
		objChild.greet();
	}
}