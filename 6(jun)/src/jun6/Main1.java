package jun6;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		
		Bank b=new  BankImplements();
		BankImplements bi=(BankImplements)b;
		bi.giveLoan();
		b.deposit(1000);
		b.withdraw(3000);
		b= new Branch();
		Branch br=(Branch)b;
		br.service("Net Banking");
		br.withdraw(300);
		System.out.println("main method is terminated");
	}

}
