package this_super;

class ThisProg3 {
	int id;
	String name;

	ThisProg3() {
		this(5, "XYZ");  /*Parameterized constructor*/
		System.out.println("Default Constructor Called");
	}

	/*Parameterized constructor*/
	ThisProg3(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	void output() {
		System.out.println("ID: " + id + ", Name: " + name);
	}

	public static void main(String[] args) {
		
		ThisProg3 info = new ThisProg3();
		info.output();
	}
}