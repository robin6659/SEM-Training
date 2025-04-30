package overridding;

public class MainTransport {
	public static void main (String[] args) {

		Transport basic = new Transport(10);
		Bus bus = new Bus(10);
		Taxi taxi = new Taxi(10);

		basic.printCost();
		bus.printCost();
		taxi.printCost();
	}
}
