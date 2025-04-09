package Interface;

public class InterfaceAnimalMain {

	public static void main(String[] args) {

		InterfaceAnimal animalDog = new InterfaceDog();
		animalDog.sound();
		animalDog.sleep();
		System.out.println("       ");
		InterfaceAnimal animalCat = new InterfaceCat();
		animalCat.sound();
		animalCat.sleep();
	}
}