package this_super;

public class SuperProg1Child extends SuperProg1Parent {

	public void startswtith() {
		System.out.println("Starts in mode SPORT+");
	}

	public void output() {
		super.start();/*parent*/
		startswtith();/*child*/
	}
}