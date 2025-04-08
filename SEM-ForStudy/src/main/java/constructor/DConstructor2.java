package constructor;

public class DConstructor2 {

	String productName;
	int productId;
	double price;

	DConstructor2() {
		productName = "Acer";
		productId = 101;
		price = 66000.99;

		System.out.println("Product Name " + productName);
		System.out.println("Product Id " + productId);
		System.out.println("Product Price " + price);
	}

	public static void main(String[] args) {
		DConstructor2 product = new DConstructor2();
	}
}