package Abstraction;

public class ChildClassExample extends AbstractionExample {

    @Override
    public void displayMessage() {
        System.out.println("Abstract method implementation");
    }

    public static void main(String[] args) {
        
        ChildClassExample obj = new ChildClassExample();
        
        obj.showInfo();
        
        obj.displayMessage();
    }
}