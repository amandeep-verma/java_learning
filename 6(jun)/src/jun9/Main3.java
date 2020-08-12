package jun9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileInputStream fi=null;
		BufferedInputStream bi=null;

		try {
			//Class.forName("com.jsp.Tester"); //class is a inbuilt class in java.
			//Class.forName which loads the class into class area explicitly 
			fi=new FileInputStream("/Users/amandeepverma/Desktop/hadoop_commands.txt");
			bi=new BufferedInputStream(fi);
			System.out.println("enter your full name");
			String name=sc.nextLine();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("entered catch block");
		}
		finally {
			try {
				if(sc!=null)
					sc.close();
				if(fi!=null)
					fi.close();
				if(bi!=null)
					bi.close();
			}
			catch(NullPointerException | IOException e)
			{
				System.out.println("object not created");
			}
		}
	}
}
