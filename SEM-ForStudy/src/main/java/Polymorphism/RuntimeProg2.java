package Polymorphism;

class Employee {
	int salary() {
		return 10000;
	}
}

class Developer extends Employee {

	int salary() {

		int baseSalary = 10000;
		int bonus = 2000;

		return baseSalary + bonus;
	}

}

public class RuntimeProg2 {
	public static void main(String[] args) {

		Developer developer = new Developer();

		System.out.println("Updated Salary: "+developer.salary());
	}
}
