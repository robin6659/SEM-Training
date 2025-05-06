package RevisionTwo;

public class Honda extends Bike {
	public void run() {
		super.run();
		System.out.println("Honda is running");
	}

	public static void main (String[] args) {

//		Bike bike = new Bike();
//		bike.run();
		
		Honda honda = new Honda();
		honda.run();
	}
}