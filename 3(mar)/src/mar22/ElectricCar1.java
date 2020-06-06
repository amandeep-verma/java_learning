package mar22;

public class ElectricCar1 extends Car1{
	
	void Car1()
	{
		System.out.println("trying to override constructor of car1");
	}
	ElectricCar1()
	{
		System.out.println("constructor of electricCar");
	}
	
	void ElectricCar1()
	{
		System.out.println("method electricCar");
	}
	
//	void Start()
//	{
//		System.out.println("electric car starts");
//		super.Start();
//	} 
//	
	void disp()
	{
		Start();
		
	}
}
