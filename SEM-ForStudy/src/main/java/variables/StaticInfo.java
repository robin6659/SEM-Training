package variables;

public class StaticInfo {
	static String Name = "ABC";
	static int Age = 25;

	public static void main (String[] args) {
		System.out.println("Info: " +StaticInfo.Name+" "+StaticInfo.Age);
	}
}