package Inheritance;


	class A{
		
		public void Rushikesh() {
			System.out.println("I am Good Boy");
		}
		
		
	}

	class B extends A{
		
		public void Sachin() {
			System.out.println("Hi Sachin");
		}
	}

	class C extends B{
		public void Varad() {
			System.out.println("Hi Varad");
		}
	}

	public class MultilevelInheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			C c = new C();
			c.Rushikesh();
			c.Sachin();
			c.Varad();
		}

	}



