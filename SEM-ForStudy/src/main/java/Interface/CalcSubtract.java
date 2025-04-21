package Interface;

public class CalcSubtract implements Calculator{

	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		
		int result = a - b;
		System.out.println(result);
		
	}

}