package Interface;

class InterfaceDog implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("Barks");		
	}

	@Override
	public void sleep() {
		System.out.println("Need 8hr");				
	}

}