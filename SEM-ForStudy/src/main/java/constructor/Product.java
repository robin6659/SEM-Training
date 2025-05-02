package constructor;

public class Product {
	int id;
	String name;
	int price;

	public Product(int i, String n) {
		id = i;
		name = n;
		price = 100;
	}

	public Product(int i, String n, int p) {
		id = i;
		name = n;
		price = p;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
	}

	public static void main(String[] args) {
		Product product1 = new Product(1, "Pen");
		product1.display();

		Product product2 = new Product(2, "Notebook", 50);
		product2.display();
	}
}