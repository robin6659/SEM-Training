package parameterizedandnonparameterized;

public class ParamProg3 {

	public static void rectangle( int length, int width) {
		int area = length * width;

		System.out.println("Area: "+area);
	}
	public static void main (String[] args) {
		rectangle(55,4);
	}
}