package basicprinting;

public class OneValue {
	public static void oneValueInit() {
		int x, y, z;
		x = y = z = 90;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x+" "+y+" "+z);
		System.out.println(x+y+z);
	}
	public static void main (String[] args) {
		oneValueInit();
	}
}