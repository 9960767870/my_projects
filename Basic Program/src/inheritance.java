
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c =  new C();
		
		c.add(10, 10);
		c.sub(20, 10);
		c.mul(10, 10);
		c.div(100, 10);
	}

}

 interface A
 {
	 public void add(int num1,int num2);
	 public void sub(int num1,int num2);
	
 }
 
 interface B extends A
 {
	 
	 public void mul(int num1,int num2);
	 public void div(int num1,int num2);
 
 }
 
 class C implements B
 {
	 @Override
		public void add(int num1, int num2) {
			
			System.out.println(num1+num2);
		}

		@Override
		public void sub(int num1, int num2) {
			// TODO Auto-generated method stub
			System.out.println(num1-num2);
		}

		@Override
		public void mul(int num1, int num2) {
			// TODO Auto-generated method stub
			System.out.println(num1*num2);
		}

		@Override
		public void div(int num1, int num2) {
			// TODO Auto-generated method stub
			System.out.println(num1/num2);
		}
 }
