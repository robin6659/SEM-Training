package parameterizedandnonparameterized;

public class NonParamProg4 {
	public void add() {
		int a = 10, b = 20;
		int sum = a + b;
		System.out.println("Sum: " + sum);
	}
	public static void main(String[] args) {
		NonParamProg4 addobj = new NonParamProg4();
		addobj.add();
	}
}