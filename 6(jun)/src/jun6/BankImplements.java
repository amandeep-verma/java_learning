package jun6;

public class  BankImplements implements Bank{
	
	int noOfBranches;
	String location;

	public void deposit(double amount)
	{
		System.out.println(amount + " money deposited");
	}
	public void withdraw(double amount)
	{
		System.out.println("Poor kid , you dont have sufficent balance");
	}
	void giveLoan()
	{
		System.out.println("loan cant be sanctioned");
	}
}
