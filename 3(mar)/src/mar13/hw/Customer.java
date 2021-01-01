package mar13.hw;
// parent class with only one constructor which is parameterized so have to explicitly call the constructor in 
// child class.
public class Customer extends Person{

	long id;
	double bill;
	Customer(String name,int age,long id,double bill) 
	{
		super(name,age);
		this.id=id;
		this.bill=bill;
	}
	void CusInfo() 
	{
		PersonInfo();
		System.out.println("id "+id);
		System.out.println("bill "+bill);
	}
	

}
