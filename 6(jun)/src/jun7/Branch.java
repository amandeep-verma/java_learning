package jun7;

public abstract class Branch extends Bank{

	Branch() 
	{
		super("canara",20,4000.0);
	}
	
	abstract void payLoan();
	
	void giveLoan() {
		System.out.println("sanctioned");
	}
	
}
