package Revision;

class Student {

	Student() {

		System.out.println("Student is called");
	}	

}

class College extends Student {

	College() {

		System.out.println("College is called");
	}	

}

public class PracticeInheritanceConstructor {

	public static void main (String[] args) {

		College clgObj = new College();
	}
}