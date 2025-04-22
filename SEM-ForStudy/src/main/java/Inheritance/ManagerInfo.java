package Inheritance;

public class ManagerInfo extends EmployeeInformation {
	String department;

	public ManagerInfo(String firstName, String lastName, String id, String department) {
		super(firstName, lastName, id);
		this.department = department;
	}

	public void displayAllInfo() {
		String empInfo = getEmployeeInfo();

		System.out.println("Manager Info: " + empInfo);
		System.out.println("Department: " + department);
		System.out.println("Department in lowercase: " + department.toLowerCase());
		System.out.println("Does department start with 'D' " + department.startsWith("D"));
	}
}
