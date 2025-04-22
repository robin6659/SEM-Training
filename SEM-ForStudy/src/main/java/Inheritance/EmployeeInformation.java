package Inheritance;

public class EmployeeInformation extends PersonInfo {
	String employeeID;

	public EmployeeInformation(String firstName, String lastName, String employeeID) {
		super(firstName, lastName);
		this.employeeID = employeeID;
	}

	public String getEmployeeInfo() {
		String fullName = getFullName();
		return "Name: " + fullName + ", ID: " + employeeID;
	}
}
