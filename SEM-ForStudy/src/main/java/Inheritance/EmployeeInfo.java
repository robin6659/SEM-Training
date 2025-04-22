package Inheritance;

/* Parent class: Person */
class Person {
	String firstName;
	String lastName;

	/* Constructor for Person class */
	Person(String firstName, String lastName) {
		/* 'this' refers to the current object's instance variables */
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/* Method to return full name in uppercase */
	String getFullName() {
		
		return (firstName + " " + lastName).toUpperCase();
	}
}

/* Child class: Inherits from Person */
class EmployeeDetail extends Person {
	String employeeID;

	/* Constructor for EmployeeDetail */
	EmployeeDetail(String firstName, String lastName, String employeeID) {
		/* Call parent class (Person) constructor to set firstName and lastName */
		super(firstName, lastName);

		/* Set employee ID specific to EmployeeDetail class */
		this.employeeID = employeeID;
	}

	/* Method to display employee details */
	void DisplayInfo() {
		/* Call getFullName() from parent class */
		String fullName = getFullName();

		System.out.println("Employee Name: " + fullName);
		System.out.println("Name Length: " + fullName.length());
		System.out.println("Employee ID: " + employeeID);
		System.out.println("First 3 letters of Name: " + fullName.substring(0, 3));
	}
}

/* Main class - Entry point of the program */
public class EmployeeInfo {
	public static void main(String[] args) {
		/* Step 1: Create an object of EmployeeDetail and pass values */
		EmployeeDetail emp = new EmployeeDetail("Robin", "Abraham", "C63");

		/* Step 2: Call method to display employee information */
		emp.DisplayInfo();
	}
}