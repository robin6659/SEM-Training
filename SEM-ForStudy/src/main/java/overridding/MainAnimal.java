package overridding;

public class MainAnimal {
	public static void main (String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
        
		// Creating an object of Dog but referencing it as Animal (polymorphism)
		Animal dog = new Dog();
		dog.makeSound();

		Animal cat = new Cat();
		cat.makeSound();
	}
}
