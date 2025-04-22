package Revision;

public class TestReport {

	public static void main(String[] args) {

		TestCase t1 = new PassedTest ("Login functionality");
		TestCase t2 = new FailedTest ("Searxh functionality");

		System.out.println(t1.getResult());
		System.out.println(t2.getResult());		
	}
}