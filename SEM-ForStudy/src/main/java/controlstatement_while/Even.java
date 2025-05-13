package controlstatement_while;

public class Even {

	public static void evennumbers() {

		int i = 2; /*Step 1: Start with i = 2*/

		/*Step 2: Enter the while loop*/
		while (i <= 10) {  /*Check: Is i <= 10? (If yes, run the loop. If no, exit.)*/

			/*Step 3: Print current i*/
			System.out.println(i);  /*Print the even number*/

			/*Step 4: Add 2 to i to get the next even number*/
			i += 2;  /*i = i + 2*/
		}

		/*Step 5: Loop ends when i > 10*/
	}

	public static void main(String[] args) {
		evennumbers();  /*Call the method to start the process*/
	}
}
