package Inheritance;

public class PersonInfo {
	String firstName;
	String lastName;

	PersonInfo(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String getFullName() {
		return (firstName + " " + lastName);
	}
}
