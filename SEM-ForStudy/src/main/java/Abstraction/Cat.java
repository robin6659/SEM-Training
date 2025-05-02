package Abstraction;

public class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meow");
	}

	public static void main (String[] args) {
		
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        Cat cat = new Cat();
        cat.sound();
        cat.sleep();

	}

}