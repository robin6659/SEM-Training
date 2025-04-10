package this_super;

public class SuperProg3Child extends SuperProg3Parent {

	String color = "Brown";

	public void colors() {
		System.out.println("White chocolate color is "+super.color);
		System.out.println("Dark chocolate color is "+color);
	}
}
