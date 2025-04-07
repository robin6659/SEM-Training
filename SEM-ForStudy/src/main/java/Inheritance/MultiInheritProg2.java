package Inheritance;

class Company {
	String companyName = "Technologies";
}

class Employee extends Company {
	String empName = "XYZ";
}

class Salary extends Employee {
	int salary = 5;
}

public class MultiInheritProg2 {

	public static void main(String[] args) {

		Salary salary = new Salary();
		
		System.out.println("Company: " + salary.companyName);
		System.out.println("Employee Name: " + salary.empName);
		System.out.println("Salary: " + salary.salary);
	}
}