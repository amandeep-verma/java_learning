package jun7;

abstract public class Bank {
	String name;
	public static final String location="India";
	int noOfbranches;
	double balance;
	Bank(String name,int n,double b)
	{
		this.name=name;
		noOfbranches=n;
		balance=b;
	}
	abstract void deposit(double amount);
	void withdraw(double amount)
	{
		balance=balance-amount;
		System.out.println("available balance="+balance);
	}
	abstract void giveLoan();
}
