package overridding;

public class Transport {
	int distance;

	public Transport(int distance) {
		this.distance = distance;
	}

	public void printCost() {

		int cost = distance * 5;

		System.out.println(cost);
	}

}