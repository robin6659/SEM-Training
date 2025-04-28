package parameterizedandnonparameterized;

public class NonParameterized1 {

	public String Message() {
		return "hello world";
	}

	public static void main(String[] args) {
		NonParameterized1 msgObj = new NonParameterized1();
		System.out.println(msgObj.Message());	
	}
}