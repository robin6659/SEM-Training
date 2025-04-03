package basicprog;

public class Prog1 {

	public void NonStat() {

		System.out.println("Example for non static");

	}
	public static void main (String[] args) {

		/*SYNTAX OBJECT CREATION*/
		/* className objectname = new className*/

		Prog1 nonstat = new Prog1();
		nonstat.NonStat();
	}
}