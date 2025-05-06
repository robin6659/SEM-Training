package controlstatement_while;

public class Square {

	public static void squaring() {

		int i = 1;

		while (i <= 5) {
			System.out.println(i * i);
			i++;
		}
	}

	public static void main (String[] args) {
		squaring();
	}

}