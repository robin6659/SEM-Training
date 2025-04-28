package Revision;

/*Food & FastFood (Inheritance + Constructors)*/

class Food {

	String name;

	Food(String name) {

		this.name = name;
	}

	void showName() {
		System.out.println(name);
	}

}

class FastFood extends Food {

	int calories;

	FastFood(String name, int calories) {
		super(name);
		this.calories = calories;
		System.out.println(calories);	
	}

	void showDetails() {
		super.showName();
		System.out.println();
	}

}


public class FoodTest {

	public static void main (String[] args)	{

		FastFood item = new FastFood("Burger",550);
		item.showDetails();

	}

}