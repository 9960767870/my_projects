package innerclasses;

public class DemoOuterClass {
	//outer class;
		int numout = 49;
		
		void method() {
			System.out.println("Outer class method");
		}
		
		class DemoInnerClas{//Inner class;
			
			int numIn = 25;
			
			 void show() {
				 method();
			System.out.println("numout:"+numout);
			System.out.println("numIn:"+numIn);
			
			 }
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			DemoOuterClass out = new DemoOuterClass();
	 
			DemoOuterClass.DemoInnerClas in = out.new DemoInnerClas();
			in.show();
		}

	}

