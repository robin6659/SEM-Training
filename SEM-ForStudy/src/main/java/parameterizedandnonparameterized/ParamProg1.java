package parameterizedandnonparameterized;

public class ParamProg1 {
	public void old(int age) {
		System.out.println("Eva is "+age+" years old");
	}

	public static void main (String[] args) {
		ParamProg1 ageObj = new ParamProg1();
		ageObj.old(12);
	}
}