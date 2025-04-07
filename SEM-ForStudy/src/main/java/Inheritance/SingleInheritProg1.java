package Inheritance;

/*Parent class*/
class Animal {
	void eat() {
		System.out.println("Animal eats food");
	}
}

/*Child class*/
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class SingleInheritProg1 {
	public static void main (String[] args) {

		/*Object of Child*/
		Dog dog = new Dog();
		dog.eat(); /*Inherits from Animal*/
	}
}