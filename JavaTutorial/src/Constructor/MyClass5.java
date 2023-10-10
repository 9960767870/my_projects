package Constructor;

class Test{
	int Evenodd;
	int Factorialnumber;
	int Sumofdigitnumber;
	
	public Test(int Evenodd,int Factorialnumber,int Sumofdigitnumber) {
		
		this.Evenodd = Evenodd;
		this.Factorialnumber = Factorialnumber;
		this.Sumofdigitnumber = Sumofdigitnumber;
		
	}
	
	public void Evenodd() {
		if(Evenodd%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
	
	public void Factorial() {
		
		int i=1;
		int fact = 1;
		while(i<=Factorialnumber) {
			fact = fact *i;
			i++;
		}
		System.out.println(fact);
	}
	
	public void sumofdigit() {
		int num = Sumofdigitnumber;
		int sum = 0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
			
		}
		System.out.println(sum);
	}
}

public class MyClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test(12, 3, 100);
		t.Evenodd();
		t.Factorial();
		t.sumofdigit();

	}

}
