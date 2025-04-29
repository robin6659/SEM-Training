package learnmultilevelinheritance;

public class PersonGrandParent {

	String name;
	int age;

	public PersonGrandParent(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void displayPersonInfo() {
		System.out.println( age+" "+name);
	}
}