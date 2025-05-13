package RevisionTwo;

public class Child extends Parent {
	public void displayChild() {
		System.out.println("Im child");
	}

	public static void main (String[] args) {
		Child child = new Child();
		
		child.displayChild();
		child.displayParent();
		child.displayGrandparent();
	}
}
