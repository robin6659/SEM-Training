package abstractionrevision;

public class CarEv extends Car{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Silent");	
	}

	public static void main(String[] args) {

		Car icecar = new CarIce();
		Car evcar = new CarEv();

		icecar.sound();
		evcar.sound();
	}

}
