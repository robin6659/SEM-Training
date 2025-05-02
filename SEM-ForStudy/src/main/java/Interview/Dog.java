package Interview;

public class Dog extends Animal{

	public void sound (String x) {
		
		System.out.println("Barks");
	
	}

	public static void main (String[] args) {
		
		Dog dog = new Dog();
		
		dog.sound();
		dog.sound("s");
	}
}
