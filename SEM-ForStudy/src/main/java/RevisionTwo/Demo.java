package RevisionTwo;

public class Demo {

	public void display() {
		System.out.println("hi im this keyword");
	}

	public void callDisplay() {
		this.display();
		System.out.println("Learn this");
	}

	public static void main (String[] args) {

		Demo demo = new Demo();
		demo.callDisplay();
	}

}