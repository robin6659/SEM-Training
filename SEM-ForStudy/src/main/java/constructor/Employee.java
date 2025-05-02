package constructor;

public class Employee {
	int id;
	String name;
	int salary;

	public Employee() {
		id = 0;
		name = "Not Assigned";
		salary = 30000;
	}

	public Employee(int i, String n, int s) {
		id = i;
		name = n;
		salary = s;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee(1, "XYZ", 55000);
		e2.display();
	}
}