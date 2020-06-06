package mar13;

public class Student3 extends Person3{
	int Sid;
	double  Sper;
	Student3(String name, int age,int Sid,double Sper) {
		super(name, age);
		this.Sid=Sid;
		this.Sper=Sper;
	}
	void stdInfo()
	{
		PersonInfo();
		System.out.println("Id:"+Sid);
		System.out.println("Sper"+Sper);
	}

	
}
