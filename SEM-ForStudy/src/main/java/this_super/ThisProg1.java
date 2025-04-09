package this_super;

public class ThisProg1 {
	String name;
	int age;

	ThisProg1(String name, int age) {
		this.name = name;
		this.age  = age;
	}

	public void outputIs() {
		System.out.println(""+name);
		System.out.println(""+age);
	}

	public static void main (String[] args) {
		ThisProg1 thisprog1 = new ThisProg1("XYZ", 3);
		thisprog1.outputIs();
	}
}