package Interface;

public class InterfaceCat implements InterfaceAnimal {

	@Override
	public void sound() {
System.out.println("Meow");		
	}

	@Override
	public void sleep() {
System.out.println("need 12 hr");		
	}

}