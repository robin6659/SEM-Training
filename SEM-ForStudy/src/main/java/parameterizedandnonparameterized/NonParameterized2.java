package parameterizedandnonparameterized;

public class NonParameterized2 {

	public void Add() {

		int num1 = 2;
		int num2 = 3;

		int answer = num1+num2;

		System.out.println(answer);
	}

	public static void main (String[] args) {

		NonParameterized2 nonObj = new NonParameterized2();
		nonObj.Add();
	}
}