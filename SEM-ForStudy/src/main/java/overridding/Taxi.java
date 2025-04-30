package overridding;

public class Taxi extends Transport {

	public Taxi(int distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}
	public void printCost() {
		int cost = distance*10;
		System.out.println(cost);
	}
}