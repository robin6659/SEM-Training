package RevisionTwo;

public class Add extends Calculates {

	public void adds() {
		super.adds(20, 30);
	}

	public static void main (String[] args) {

		Add add = new Add();
		add.adds();
	}

}