package overridding;

public class LoginTest extends TestCase {

	public boolean runTest() {

		String expectedUsername = "admin";
		String actualUsername = "ad3in";

		return expectedUsername.equals(actualUsername);

	}

	public static void running() {

		LoginTest logintest = new LoginTest();
		/*TestCase test = new LoginTest();*/

		Boolean result = logintest.runTest();

		if (result) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}	
	}

	public static void main(String[] args) {

		running();
	}

}
