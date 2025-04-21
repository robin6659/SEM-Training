package Polymorphism;

/*Method Overloading*/

public class CompiletimeProg2 {

	public static void print (String name) {
		System.out.println("Name: "+name);
	}

	public static void print (int model){
		System.out.println("model#: "+model);
	}
	public static void print (int year, String place){
		System.out.println("year & place: "+year+" "+place);
	}
	public static void main (String[] args) {
		print("Porsche911");
		print(997);
		print(2013, "Kerala");
	}

}