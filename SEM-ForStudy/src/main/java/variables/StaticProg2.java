package variables;

public class StaticProg2 {

	/*Static variables*/
	static String Name = "Robin";
	static String Message ="Hello world";
	static int Age = 27;

	public static void info1() {
		System.out.println("Message is "+Message);
	}
	public static void info2() {
		System.out.println("Age is "+Age);
	}

	public static void main (String[] args) {

		/*Printing static variable directly*/
		System.out.println(Name);

		/*Calling static method using object*/
		StaticProg2 staticprogObj = new StaticProg2();
		staticprogObj.info1();

		/*Calling static method directly*/
		info2();
	}
}
