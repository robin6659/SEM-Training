package this_super;

class SuperProg2Child extends SuperProg2Parent {
	
	String branchName;

	SuperProg2Child(String bankName, String branchName) {
		super(bankName);  /*parent constructor*/
		this.branchName = branchName;
		System.out.println("Branch Name: " + branchName);
	}

	void displayDetails() {
		super.displayDetails();  // calling parent method
		System.out.println("SBI provides loan offers");
	}
}
