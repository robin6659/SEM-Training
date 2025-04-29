package learnmultilevelinheritance;

public class EmployeeParent extends PersonGrandParent {

	int employeeId;
	String department;


	public EmployeeParent(String name, int age, int employeeId, String department) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.employeeId = employeeId;
		this.department = department;
	}

	public void displayEmployeeInfo() {

		displayPersonInfo();
		System.out.println(employeeId+ " "+department);
	}

}