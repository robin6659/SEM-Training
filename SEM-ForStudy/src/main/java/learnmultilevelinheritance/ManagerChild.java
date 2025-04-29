package learnmultilevelinheritance;

public class ManagerChild extends EmployeeParent{

	int teamSize; 

	public ManagerChild(String name, int age, int employeeId, String department, int teamSize) {
		super(name, age, employeeId, department);
		// TODO Auto-generated constructor stub
		this.teamSize = teamSize;
	}

	public void displayManagerInfo() {

		displayEmployeeInfo();
		System.out.println(teamSize);
	}

}
