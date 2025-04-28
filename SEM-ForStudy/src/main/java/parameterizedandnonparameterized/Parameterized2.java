package parameterizedandnonparameterized;

public class Parameterized2 {


	public void Info (String Name) {
		System.out.println(Name);
	}

	public static void main (String[] args) {
		Parameterized2 paramObj = new Parameterized2();
		paramObj.Info("Hello");
	}
}