package this_super;

class SuperProg2Parent {
    String bankName;

    SuperProg2Parent(String name) {
        this.bankName = name;
        System.out.println("Bank Name: " + bankName);
    }

    void displayDetails() {
        System.out.println("Bank provides loans");
    }
}