package decisionmaking_switch;

public class TrafficLightSwitch {

	public static void switchtraffic() {
		String color = "Red";

		switch (color) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid color");
		}
	}

	public static void main (String[] args)	{
		switchtraffic();
	}

}