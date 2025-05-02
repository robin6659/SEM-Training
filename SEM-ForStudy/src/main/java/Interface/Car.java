package Interface;

public class Car implements Drive, Refuel {

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
        System.out.println("Refueling");
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
        System.out.println("Driving");
	
	}

}
