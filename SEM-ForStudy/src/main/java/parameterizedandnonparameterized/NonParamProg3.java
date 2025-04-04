package parameterizedandnonparameterized;

public class NonParamProg3 {

	public String message() {
		return "hello world";
	}
	public static void main (String[] args) {
		NonParamProg3 messageObj = new NonParamProg3();
		System.out.println(messageObj.message());
	}
}