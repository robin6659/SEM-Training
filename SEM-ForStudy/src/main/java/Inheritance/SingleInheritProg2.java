package Inheritance;

public class SingleInheritProg2 {

	static class Employee {
		int salary = 25000;
	}

	static class Tester extends Employee {
		int bonus = 5000;
	}

	public static void main(String[] args) {
		Tester tester = new Tester(); 
		System.out.println(tester.salary);
		System.out.println(tester.bonus);
	}
}