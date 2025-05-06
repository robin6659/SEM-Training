package RevisionTwo;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void calculate() {
		this.add(5, 1);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calculate();     }

}
