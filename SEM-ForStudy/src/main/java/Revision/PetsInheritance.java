package Revision;

class Dog {
	String sound = "Barks";
}

class Character extends Dog {
	String charct = "Loyal";
}

class Action extends Character {
	String actions = "wags tail";
}

public class PetsInheritance {

	public static void main (String[] args) {

		Action action = new Action();

		System.out.println(action.actions);
		System.out.println(action.charct);
		System.out.println(action.sound);
	}

}