package basicprog;

public class Prog3 {

	public void NonStat() {

		System.out.println("Example for non-static");

	}

	public static void Stat() {

		System.out.println("Example for static");

	}

	public static void main (String[] args) {
		Prog3 nonstat = new Prog3();
		nonstat.NonStat();
		Stat();
	}
}
