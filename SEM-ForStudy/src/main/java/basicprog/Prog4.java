package basicprog;

public class Prog4 {

	public void nonStatic() {
		System.out.println("Non");
	}

	public static void isStatic() {
		System.out.println("Stat");
	}
	public static void main (String[] args) {
		Prog4 nonstatic = new Prog4();
		nonstatic.nonStatic();
		isStatic();
	}
}
