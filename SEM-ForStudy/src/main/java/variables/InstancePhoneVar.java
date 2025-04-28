package variables;

public class InstancePhoneVar {

	String brand;
	int price;

	public static void main (String[] args) {

		InstancePhoneVar phone = new InstancePhoneVar();
		phone.brand = "apple";
		phone.price = 9999;

		System.out.println(phone.brand+" "+phone.price);
	}

}