package jun6;

public class Branch extends BankImplements{

	@Override
	public void deposit(double amount) {
	System.out.println("money deposited in Mysore branch");
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Money withdrawn from Mysore branch");
	}
	 void service(String serviceName)
	 {
		 System.out.println("Provides "+serviceName+" is provided for you");
	 }

}
