package constructor;

public class Student {

	String name;
	int age;

	public Student(String n, int a)	{

		name = n;
		age = a;
	}

	public void display () {
		System.out.println(name+age);
	}

	public static void main(String[] args) {
		Student student = new Student("Robin ", 25);
		student.display();
	}
}