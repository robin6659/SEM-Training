package Polymorphism;

class Animal {
	void sound() {
		System.out.println("make noise");
	}
}

/*Dog is the Child class*/
class Dog extends Animal {
	void sound() {
		/*Overriding the parent class method*/
		System.out.println("Barks!!");
	}
}

public class RuntimeProg1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}

}