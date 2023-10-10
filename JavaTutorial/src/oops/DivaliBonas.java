package oops;

import java.util.Scanner;

class Salary{
	
	public void calculateSalary() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter the exp");
		int exp = sc.nextInt();
		
		
		if(exp>5) {
			
			double totalsalary = salary*1.35;
			System.out.println(totalsalary);
		}
		else {
			double totalsalary = salary*1.15;
			System.out.println(totalsalary);
		}
			
			
	}
}

public class DivaliBonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salary s = new Salary();
		s.calculateSalary();
	}

}
