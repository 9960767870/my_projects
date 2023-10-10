package BasicProgram;

import java.util.Scanner;

public class Acountmanagement 
{
	
	String Acountholdername;
	int balence=0;
	
	void inserdata()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the acount name");
		Acountholdername = sc.next();
		
		System.out.println("congrats");
		
	}
	
	void displaydata()
	{
		System.out.println(Acountholdername);
		System.out.println( balence);
	}
	
	void diposite(int amount)
	{
		balence = balence+amount;
	}
	
	void withdrow(int amount)
	{
		balence = balence-amount;
	}

	public static void main(String[] args) 
	{
	Acountmanagement a = new Acountmanagement();
	
	a.inserdata();
	
	a.diposite(50000);
	a.displaydata();
	
	a.withdrow(10000);
	a.displaydata();

	}

}
