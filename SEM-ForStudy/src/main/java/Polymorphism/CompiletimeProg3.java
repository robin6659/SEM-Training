package Polymorphism;

public class CompiletimeProg3 {
	public void area (int length, int breadth) {
		System.out.println(""+(length * breadth));
	}

	public void area (int side) {
		System.out.println(""+(side * side));
	}

	public static void main(String[] args) {
		CompiletimeProg3 areaobj = new CompiletimeProg3();
		areaobj.area(3,2);
		areaobj.area(5);
	}
}