package parameterizedandnonparameterized;

public class ParamProg4 {

	public int squaring (int num) {
		return num*num;
	}
	public static void main(String[] args) {
		
		ParamProg4 sqrObj = new ParamProg4();
		int sqrOutput = sqrObj.squaring(8);
		
		System.out.println(sqrOutput);
	}
}