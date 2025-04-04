package parameterizedandnonparameterized;

public class ParamProg2 {

	public static void AddNumbers (int x, int y) {
		int z = x+y;
		System.out.println("Sum: "+z);
	}

	public void CarInfo (String CarName) {
		System.out.println("That is a: "+CarName);
	}

	public int Product (int x, int y) {
		int z = x * y;
		return z;
	}

	public static void main(String[] args) {
		AddNumbers(2,8);

		ParamProg2 paramprog2 = new ParamProg2();

		paramprog2.CarInfo("911");

		int output = paramprog2.Product(8, 4);
		System.out.println(output);
	}
}