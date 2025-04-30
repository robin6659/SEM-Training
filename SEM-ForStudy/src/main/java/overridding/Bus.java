package overridding;

public class Bus extends Transport {

	public Bus(int distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	public void printCost() {
		int cost = distance *3;
		System.out.println(cost);
	}
}
