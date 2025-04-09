package Abstraction;

public class ChildClassExample extends AbstractionExample {

    @Override
    public void displayMessage() {
        System.out.println("Hi, this is an abstract method implementation.");
    }

    public static void main(String[] args) {
        
        ChildClassExample obj = new ChildClassExample();
        
        obj.showInfo();
        
        obj.displayMessage();
    }
}