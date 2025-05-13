package RevisionTwo;

public class WaterColor implements Draw{

	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		System.out.println("Watercoloring");
	}

	public static void main(String[] args) {
		
		Draw pencil = new Pencil();
		Draw water = new WaterColor();
		
		pencil.drawing();
		water.drawing();
	}
	
}
